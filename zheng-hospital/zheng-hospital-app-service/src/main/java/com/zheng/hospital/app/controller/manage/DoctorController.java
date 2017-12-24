package com.zheng.hospital.app.controller.manage;

import com.github.pagehelper.PageInfo;

import com.zheng.common.base.BaseController;
import com.zheng.hospital.app.controller.AppBaseController;
import com.zheng.hospital.app.exception.ChcAuthorizeException;
import com.zheng.hospital.app.utils.ResultVOUtil;
import com.zheng.hospital.app.vo.ResultVO;
import com.zheng.hospital.dao.model.ChcDoctorInfo;
import com.zheng.hospital.dao.model.ChcDoctorInfoExample;
import com.zheng.hospital.rpc.api.ChcDoctorInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/doctor")
@Slf4j
public class DoctorController {

    @Autowired
    private ChcDoctorInfoService doctorServiceRpc;

    @GetMapping("/list")
    public ResultVO queryAll() {
        ChcDoctorInfoExample doctorInfoExample = new ChcDoctorInfoExample();
        List<ChcDoctorInfo> doctorInfoList = doctorServiceRpc.selectByExample(doctorInfoExample);
        throw new ChcAuthorizeException();
       // return ResultVOUtil.success(doctorInfoList);
    }

}
