package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcOrderDetailMapper;
import com.zheng.hospital.dao.model.ChcOrderDetail;
import com.zheng.hospital.dao.model.ChcOrderDetailExample;
import com.zheng.hospital.rpc.api.ChcOrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcOrderDetailService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcOrderDetailServiceImpl extends BaseServiceImpl<ChcOrderDetailMapper, ChcOrderDetail, ChcOrderDetailExample> implements ChcOrderDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcOrderDetailServiceImpl.class);

    @Autowired
    ChcOrderDetailMapper chcOrderDetailMapper;

}