package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcHospitalMapper;
import com.zheng.hospital.dao.model.ChcHospital;
import com.zheng.hospital.dao.model.ChcHospitalExample;
import com.zheng.hospital.rpc.api.ChcHospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcHospitalService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcHospitalServiceImpl extends BaseServiceImpl<ChcHospitalMapper, ChcHospital, ChcHospitalExample> implements ChcHospitalService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcHospitalServiceImpl.class);

    @Autowired
    ChcHospitalMapper chcHospitalMapper;

}