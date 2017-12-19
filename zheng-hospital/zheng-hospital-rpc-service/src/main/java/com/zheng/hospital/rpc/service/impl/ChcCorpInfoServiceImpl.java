package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcCorpInfoMapper;
import com.zheng.hospital.dao.model.ChcCorpInfo;
import com.zheng.hospital.dao.model.ChcCorpInfoExample;
import com.zheng.hospital.rpc.api.ChcCorpInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcCorpInfoService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcCorpInfoServiceImpl extends BaseServiceImpl<ChcCorpInfoMapper, ChcCorpInfo, ChcCorpInfoExample> implements ChcCorpInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcCorpInfoServiceImpl.class);

    @Autowired
    ChcCorpInfoMapper chcCorpInfoMapper;

}