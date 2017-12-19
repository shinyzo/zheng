package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcSubjectMapper;
import com.zheng.hospital.dao.model.ChcSubject;
import com.zheng.hospital.dao.model.ChcSubjectExample;
import com.zheng.hospital.rpc.api.ChcSubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcSubjectService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcSubjectServiceImpl extends BaseServiceImpl<ChcSubjectMapper, ChcSubject, ChcSubjectExample> implements ChcSubjectService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcSubjectServiceImpl.class);

    @Autowired
    ChcSubjectMapper chcSubjectMapper;

}