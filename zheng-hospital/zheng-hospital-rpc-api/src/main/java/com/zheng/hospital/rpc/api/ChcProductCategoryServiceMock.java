package com.zheng.hospital.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.hospital.dao.mapper.ChcProductCategoryMapper;
import com.zheng.hospital.dao.model.ChcProductCategory;
import com.zheng.hospital.dao.model.ChcProductCategoryExample;

/**
* 降级实现ChcProductCategoryService接口
* Created by shuzheng on 2017/12/18.
*/
public class ChcProductCategoryServiceMock extends BaseServiceMock<ChcProductCategoryMapper, ChcProductCategory, ChcProductCategoryExample> implements ChcProductCategoryService {

}
