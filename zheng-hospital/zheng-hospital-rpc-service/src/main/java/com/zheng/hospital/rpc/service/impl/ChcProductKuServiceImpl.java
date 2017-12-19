package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcProductKuMapper;
import com.zheng.hospital.dao.model.ChcProductKu;
import com.zheng.hospital.dao.model.ChcProductKuExample;
import com.zheng.hospital.rpc.api.ChcProductKuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcProductKuService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcProductKuServiceImpl extends BaseServiceImpl<ChcProductKuMapper, ChcProductKu, ChcProductKuExample> implements ChcProductKuService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcProductKuServiceImpl.class);

    @Autowired
    ChcProductKuMapper chcProductKuMapper;

}