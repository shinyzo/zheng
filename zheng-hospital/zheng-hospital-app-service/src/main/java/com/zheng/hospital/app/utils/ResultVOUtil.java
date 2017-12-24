package com.zheng.hospital.app.utils;


import com.zheng.hospital.app.enums.ResultEnum;
import com.zheng.hospital.app.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object){

        ResultVO resultVO = new ResultVO() ;
        resultVO.setCode("0");
        resultVO.setMsg("成功");
        resultVO.setData(object);

        return resultVO;
    }


    public static ResultVO success()
    {
        return success(null );
    }


    public static ResultVO error(ResultEnum resultEnum){

        ResultVO resultVO = new ResultVO() ;
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMsg());
        resultVO.setData(null);
        return resultVO;
    }

    public static ResultVO error(String code,String message)
    {
        ResultVO resultVO = new ResultVO() ;
        resultVO.setCode(code);
        resultVO.setMsg(message);
        resultVO.setData(null);
        return resultVO;
    }

}
