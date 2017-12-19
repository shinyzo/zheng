package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcDoctorLevelMapper;
import com.zheng.hospital.dao.model.ChcDoctorLevel;
import com.zheng.hospital.dao.model.ChcDoctorLevelExample;
import com.zheng.hospital.rpc.api.ChcDoctorLevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcDoctorLevelService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcDoctorLevelServiceImpl extends BaseServiceImpl<ChcDoctorLevelMapper, ChcDoctorLevel, ChcDoctorLevelExample> implements ChcDoctorLevelService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcDoctorLevelServiceImpl.class);

    @Autowired
    ChcDoctorLevelMapper chcDoctorLevelMapper;

}