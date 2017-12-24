package com.zheng.hospital.app.handler;


import com.zheng.hospital.app.enums.ResultEnum;
import com.zheng.hospital.app.exception.ChcAuthorizeException;
import com.zheng.hospital.app.exception.ChcProcessException;
import com.zheng.hospital.app.utils.ResultVOUtil;
import com.zheng.hospital.app.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常捕获处理返回错误页面
 * 有点业务侵入量小
 * 扩展方便
 */
@ControllerAdvice
@Slf4j
public class ChcExceptionHandler {


    /**
     * 用户信息鉴权异常跳转至登录页面
     * @return
     */
//    @ExceptionHandler(value = ChcAuthorizeException.class)
//    public ModelAndView handlerAuthorizeException(){
//
//        return new ModelAndView("redirect:"
//                .concat( projectUrlConfig.getWechatOpenAuthorizeUrl())
//                .concat("?returnUrl=").concat(projectUrlConfig.getSell())
//                .concat("/seller/login")
//        );
//    }

    /**
     *
     * 用户登录鉴权异常捕获，返回给前端返回码，前端进行跳转处理
     * json字符串
     * @return
     */
    @ExceptionHandler(value = ChcAuthorizeException.class)
    @ResponseBody
    public ResultVO handlerAuthorizeException(){

        return ResultVOUtil.error(ResultEnum.TOKEN_TIMEOUT);
    }

    /**
     * 异常捕获 并按统一格式返回给前端
     * @param e
     * @return
     */
    @ExceptionHandler(value = ChcProcessException.class)
    @ResponseBody
    public ResultVO handlerChcException(ChcProcessException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }



}
