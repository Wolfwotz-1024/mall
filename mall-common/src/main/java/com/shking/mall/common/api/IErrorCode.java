package com.shking.mall.common.api;

/**
 * 封装API的错误码
 * @Author SHKing
 * @Date 20/3/2022 21:56
 * @Version 1.0
 */

public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
