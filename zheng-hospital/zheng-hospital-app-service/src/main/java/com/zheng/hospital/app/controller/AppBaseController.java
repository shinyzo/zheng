package com.zheng.hospital.app.controller;

import com.zheng.common.base.BaseController;
import com.zheng.hospital.app.enums.ResultEnum;
import com.zheng.hospital.app.exception.ChcAuthorizeException;
import com.zheng.hospital.app.exception.ChcProcessException;
import com.zheng.hospital.app.utils.ResultVOUtil;
import com.zheng.hospital.app.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public abstract class AppBaseController {

    @ExceptionHandler
    @ResponseBody
    public ResultVO exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        log.error("统一异常处理：", exception);
        // shiro没有权限异常
        if (exception instanceof ChcAuthorizeException) {
            return ResultVOUtil.error(ResultEnum.TOKEN_TIMEOUT);
        }
        // shiro会话已过期异常
        if (exception instanceof ChcProcessException) {
            ChcProcessException e = (ChcProcessException) exception;
            return ResultVOUtil.error(e.getCode(),e.getMessage());
        }
        return ResultVOUtil.error(ResultEnum.ERROR);
    }

}
