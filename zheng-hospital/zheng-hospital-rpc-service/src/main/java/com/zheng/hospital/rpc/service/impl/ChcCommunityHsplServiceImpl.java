package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcCommunityHsplMapper;
import com.zheng.hospital.dao.model.ChcCommunityHspl;
import com.zheng.hospital.dao.model.ChcCommunityHsplExample;
import com.zheng.hospital.rpc.api.ChcCommunityHsplService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcCommunityHsplService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcCommunityHsplServiceImpl extends BaseServiceImpl<ChcCommunityHsplMapper, ChcCommunityHspl, ChcCommunityHsplExample> implements ChcCommunityHsplService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcCommunityHsplServiceImpl.class);

    @Autowired
    ChcCommunityHsplMapper chcCommunityHsplMapper;

}