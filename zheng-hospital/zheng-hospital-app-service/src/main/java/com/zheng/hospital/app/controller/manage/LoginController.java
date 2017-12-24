package com.zheng.hospital.app.controller.manage;


import com.alibaba.fastjson.JSON;
import com.zheng.common.util.CookieUtil;
import com.zheng.common.util.MD5Util;
import com.zheng.common.util.RedisUtil;
import com.zheng.hospital.app.constants.CookieConstant;
import com.zheng.hospital.app.constants.RedisConstant;
import com.zheng.hospital.app.enums.ResultEnum;
import com.zheng.hospital.app.utils.ResultVOUtil;
import com.zheng.hospital.app.vo.ResultVO;
import com.zheng.upms.dao.model.UpmsUser;
import com.zheng.upms.dao.model.UpmsUserExample;
import com.zheng.upms.rpc.api.UpmsUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class LoginController {

    @Autowired
    private UpmsUserService userServiceRpc;

    @GetMapping("/login")
    public ResultVO login(@RequestParam("loginName") String loginName,
                          @RequestParam("loginPass") String loginPass,
                          HttpServletResponse response) {
        UpmsUserExample upmsUserExample = new UpmsUserExample();
        upmsUserExample.or().andUsernameEqualTo(loginName);
        List<UpmsUser> upmsUserList = userServiceRpc.selectByExample(upmsUserExample);
        if (CollectionUtils.isEmpty(upmsUserList)) {
            log.info("【用户登录】 - 用户不存在，loginName={}", loginName);
            return ResultVOUtil.error(ResultEnum.NO_USER);
        }
        UpmsUser upmsUser = upmsUserList.get(0);
        if (!upmsUser.getPassword().equals(MD5Util.md5(loginPass + upmsUser.getSalt()))) {
            return ResultVOUtil.error(ResultEnum.LOGIN_FAILED);
        }

        // 设置token至redis 采用分布式session
        String uuidToken = UUID.randomUUID().toString();

        // 设置token至Cookie
        CookieUtil.setCookie(response, CookieConstant.TOKEN, uuidToken, CookieConstant.EXPIRE_TIME);

        RedisUtil.set(String.format(RedisConstant.TOKEN_PREFIX, uuidToken), JSON.toJSONString(upmsUser), RedisConstant.TOKEN_EXPIRE_TIME);

        return ResultVOUtil.success(uuidToken);
    }


    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse resposne, Map<String, Object> map) {

        String token = CookieUtil.getCookie(request, CookieConstant.TOKEN);
        if (token != null) {
            // 清除cookie中的token
            CookieUtil.removeCookie(resposne, CookieConstant.TOKEN);
            // 删除redis 对应的token
            RedisUtil.remove(String.format(RedisConstant.TOKEN_PREFIX, token));
        }
    }

}
