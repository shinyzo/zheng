package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcReserveMapper;
import com.zheng.hospital.dao.model.ChcReserve;
import com.zheng.hospital.dao.model.ChcReserveExample;
import com.zheng.hospital.rpc.api.ChcReserveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcReserveService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcReserveServiceImpl extends BaseServiceImpl<ChcReserveMapper, ChcReserve, ChcReserveExample> implements ChcReserveService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcReserveServiceImpl.class);

    @Autowired
    ChcReserveMapper chcReserveMapper;

}