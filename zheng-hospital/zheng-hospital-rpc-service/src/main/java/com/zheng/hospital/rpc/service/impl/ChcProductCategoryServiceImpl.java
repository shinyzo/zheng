package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcProductCategoryMapper;
import com.zheng.hospital.dao.model.ChcProductCategory;
import com.zheng.hospital.dao.model.ChcProductCategoryExample;
import com.zheng.hospital.rpc.api.ChcProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcProductCategoryService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcProductCategoryServiceImpl extends BaseServiceImpl<ChcProductCategoryMapper, ChcProductCategory, ChcProductCategoryExample> implements ChcProductCategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcProductCategoryServiceImpl.class);

    @Autowired
    ChcProductCategoryMapper chcProductCategoryMapper;

}