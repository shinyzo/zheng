package com.zheng.hospital.common.constants;

import com.zheng.common.base.BaseResult;

/**
 * upms系统常量枚举类
 * Created by shuzheng on 2017/2/18.
 */
public class HospitalResult extends BaseResult {

    public HospitalResult(HospitalResultConstant hospitalResultConstant, Object data) {
        super(hospitalResultConstant.getCode(), hospitalResultConstant.getMessage(), data);
    }

}
