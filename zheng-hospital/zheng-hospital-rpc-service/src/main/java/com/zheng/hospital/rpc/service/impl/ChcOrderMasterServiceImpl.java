package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcOrderMasterMapper;
import com.zheng.hospital.dao.model.ChcOrderMaster;
import com.zheng.hospital.dao.model.ChcOrderMasterExample;
import com.zheng.hospital.rpc.api.ChcOrderMasterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcOrderMasterService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcOrderMasterServiceImpl extends BaseServiceImpl<ChcOrderMasterMapper, ChcOrderMaster, ChcOrderMasterExample> implements ChcOrderMasterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcOrderMasterServiceImpl.class);

    @Autowired
    ChcOrderMasterMapper chcOrderMasterMapper;

}