package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcDoctorInfoMapper;
import com.zheng.hospital.dao.model.ChcDoctorInfo;
import com.zheng.hospital.dao.model.ChcDoctorInfoExample;
import com.zheng.hospital.rpc.api.ChcDoctorInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcDoctorInfoService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcDoctorInfoServiceImpl extends BaseServiceImpl<ChcDoctorInfoMapper, ChcDoctorInfo, ChcDoctorInfoExample> implements ChcDoctorInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcDoctorInfoServiceImpl.class);

    @Autowired
    ChcDoctorInfoMapper chcDoctorInfoMapper;

}