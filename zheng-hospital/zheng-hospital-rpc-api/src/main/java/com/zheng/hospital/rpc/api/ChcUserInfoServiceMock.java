package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcUserInfoMapper;
import com.zheng.hospital.dao.model.ChcUserInfo;
import com.zheng.hospital.dao.model.ChcUserInfoExample;

/**
* 降级实现ChcUserInfoService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcUserInfoServiceMock extends BaseServiceMock<ChcUserInfoMapper, ChcUserInfo, ChcUserInfoExample> implements ChcUserInfoService {

}
