package com.zheng.hospital.app.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zheng.common.util.CookieUtil;
import com.zheng.common.util.RedisUtil;
import com.zheng.hospital.app.constants.CookieConstant;
import com.zheng.hospital.app.constants.RedisConstant;
import com.zheng.hospital.app.exception.ChcAuthorizeException;
import com.zheng.upms.dao.model.UpmsUser;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;


/**
 * 后台过滤器
 * Created by ZhangShuzheng on 2017/01/12.
 */
@Slf4j
public class ManageInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManageInterceptor.class);

    /**
     * 登录校验
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String cookieValue = CookieUtil.getCookie(request, CookieConstant.TOKEN);
        String token = cookieValue == null ? request.getParameter("token") : cookieValue;
        // redis中是否存在改token
        String userJsonData = RedisUtil.get(String.format(RedisConstant.TOKEN_PREFIX, token));
        UpmsUser upmsUser = JSON.parseObject(userJsonData, new TypeReference<UpmsUser>() {});
        if (upmsUser == null) {
            log.warn("【登录校验】- redis中找不到token，token={}", token);
            throw new ChcAuthorizeException();
        }
        // 更新cookie中的失效时间
        CookieUtil.setCookie(response,CookieConstant.TOKEN,token,CookieConstant.EXPIRE_TIME);
        //  更新redis中的token失效时间
        RedisUtil.set(String.format(RedisConstant.TOKEN_PREFIX,token),userJsonData,RedisConstant.TOKEN_EXPIRE_TIME);
        // todo 重新生成一个新的token 安全性更高防止用户操作之后他人盗用该token 操作更复杂

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
