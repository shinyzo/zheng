package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcMobileNavMapper;
import com.zheng.hospital.dao.model.ChcMobileNav;
import com.zheng.hospital.dao.model.ChcMobileNavExample;
import com.zheng.hospital.rpc.api.ChcMobileNavService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcMobileNavService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcMobileNavServiceImpl extends BaseServiceImpl<ChcMobileNavMapper, ChcMobileNav, ChcMobileNavExample> implements ChcMobileNavService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcMobileNavServiceImpl.class);

    @Autowired
    ChcMobileNavMapper chcMobileNavMapper;

}