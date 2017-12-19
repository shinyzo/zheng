package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcOrderDetailMapper;
import com.zheng.hospital.dao.model.ChcOrderDetail;
import com.zheng.hospital.dao.model.ChcOrderDetailExample;

/**
* 降级实现ChcOrderDetailService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcOrderDetailServiceMock extends BaseServiceMock<ChcOrderDetailMapper, ChcOrderDetail, ChcOrderDetailExample> implements ChcOrderDetailService {

}
