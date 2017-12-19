package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcHospitalMapper;
import com.zheng.hospital.dao.model.ChcHospital;
import com.zheng.hospital.dao.model.ChcHospitalExample;

/**
* 降级实现ChcHospitalService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcHospitalServiceMock extends BaseServiceMock<ChcHospitalMapper, ChcHospital, ChcHospitalExample> implements ChcHospitalService {

}
