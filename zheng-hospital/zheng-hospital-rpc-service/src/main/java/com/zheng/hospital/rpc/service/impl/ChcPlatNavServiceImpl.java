package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcPlatNavMapper;
import com.zheng.hospital.dao.model.ChcPlatNav;
import com.zheng.hospital.dao.model.ChcPlatNavExample;
import com.zheng.hospital.rpc.api.ChcPlatNavService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcPlatNavService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcPlatNavServiceImpl extends BaseServiceImpl<ChcPlatNavMapper, ChcPlatNav, ChcPlatNavExample> implements ChcPlatNavService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcPlatNavServiceImpl.class);

    @Autowired
    ChcPlatNavMapper chcPlatNavMapper;

}