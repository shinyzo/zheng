package com.zheng.hospital.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.hospital.dao.mapper.ChcTravelScheduleMapper;
import com.zheng.hospital.dao.model.ChcTravelSchedule;
import com.zheng.hospital.dao.model.ChcTravelScheduleExample;
import com.zheng.hospital.rpc.api.ChcTravelScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ChcTravelScheduleService实现
* Created by shuzheng on 2017/12/18.
*/
@Service
@Transactional
@BaseService
public class ChcTravelScheduleServiceImpl extends BaseServiceImpl<ChcTravelScheduleMapper, ChcTravelSchedule, ChcTravelScheduleExample> implements ChcTravelScheduleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChcTravelScheduleServiceImpl.class);

    @Autowired
    ChcTravelScheduleMapper chcTravelScheduleMapper;

}