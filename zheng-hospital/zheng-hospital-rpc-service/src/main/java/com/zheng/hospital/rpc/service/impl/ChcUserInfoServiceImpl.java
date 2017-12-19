package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcUserInfoMapper;
import com.zheng.hospital.dao.model.ChcUserInfo;
import com.zheng.hospital.dao.model.ChcUserInfoExample;
import com.zheng.hospital.rpc.api.ChcUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcUserInfoService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcUserInfoServiceImpl extends BaseServiceImpl<ChcUserInfoMapper, ChcUserInfo, ChcUserInfoExample> implements ChcUserInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcUserInfoServiceImpl.class);

    @Autowired
    ChcUserInfoMapper chcUserInfoMapper;

}