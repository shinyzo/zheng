package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcDoctorInfoMapper;
import com.zheng.hospital.dao.model.ChcDoctorInfo;
import com.zheng.hospital.dao.model.ChcDoctorInfoExample;

/**
* 降级实现ChcDoctorInfoService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcDoctorInfoServiceMock extends BaseServiceMock<ChcDoctorInfoMapper, ChcDoctorInfo, ChcDoctorInfoExample> implements ChcDoctorInfoService {

}
