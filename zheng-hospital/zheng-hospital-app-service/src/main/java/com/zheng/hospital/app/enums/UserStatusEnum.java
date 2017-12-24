package com.zheng.hospital.app.enums;

import lombok.Getter;

@Getter
public enum UserStatusEnum {

    NORMAL("0","正常"),

    LOCK("1","锁定"),
    ;

    private String code;

    private String msg;

    UserStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
