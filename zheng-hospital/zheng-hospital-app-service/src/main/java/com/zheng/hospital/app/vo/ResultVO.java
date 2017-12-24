package com.zheng.hospital.app.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回给前端数据统一模型
 * @param <T>
 */
@Data
public class ResultVO<T> implements Serializable {


    private static final long serialVersionUID = 5679855537586185898L;

    private String code;

    private String msg;

    private T data;

}
