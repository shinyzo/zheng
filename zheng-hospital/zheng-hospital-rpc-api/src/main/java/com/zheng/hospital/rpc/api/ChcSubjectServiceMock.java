package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcSubjectMapper;
import com.zheng.hospital.dao.model.ChcSubject;
import com.zheng.hospital.dao.model.ChcSubjectExample;

/**
* 降级实现ChcSubjectService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcSubjectServiceMock extends BaseServiceMock<ChcSubjectMapper, ChcSubject, ChcSubjectExample> implements ChcSubjectService {

}
