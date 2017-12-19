package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcOrderMasterMapper;
import com.zheng.hospital.dao.model.ChcOrderMaster;
import com.zheng.hospital.dao.model.ChcOrderMasterExample;

/**
* 降级实现ChcOrderMasterService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcOrderMasterServiceMock extends BaseServiceMock<ChcOrderMasterMapper, ChcOrderMaster, ChcOrderMasterExample> implements ChcOrderMasterService {

}
