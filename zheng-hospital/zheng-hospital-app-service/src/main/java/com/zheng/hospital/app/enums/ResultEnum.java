package com.zheng.hospital.app.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    NO_USER("1000", "用户不存在！"),
    LOGIN_FAILED("1001", "用户名或密码错误！"),

    OPENID_EMPTY("101", "openid为空"),
    ROLEID_EMPTY("102", "用户权限id为空"),

    TOKEN_TIMEOUT("777","用户长时间未操作，超时退出"),
    APP_TYPE_ERROR("771","APP类型不合法!"),
    COMMON_PARAM_ERROR("772","公共参数异常，请检查!"),
    PARAM_ERROR("773","参数异常，请检查!"),

    ERROR("999","系统异常"),
    ;

    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
