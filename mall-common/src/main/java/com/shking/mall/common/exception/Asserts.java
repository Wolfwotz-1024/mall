package com.shking.mall.common.exception;

import com.shking.mall.common.api.IErrorCode;

/**
 * 断言处理类
 * @Author SHKing
 * @Date 14/6/2022 22:07
 * @Version 1.0
 */

public class Asserts {
    public static void fail(String message){
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode){
        throw new ApiException(errorCode);
    }
}
