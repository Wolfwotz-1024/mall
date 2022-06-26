package com.shking.mall.common.exception;

import com.shking.mall.common.api.IErrorCode;

/**
 * 自定义API异常
 * @Author SHKing
 * @Date 12/6/2022 21:49
 * @Version 1.0
 */

public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message){
        super(message);
    }

    public ApiException(Throwable cause){
        super(cause);
    }

    public ApiException(String message, Throwable cause){
        super(message, cause);
    }

    public IErrorCode getErrorCode(){
        return errorCode;
    }

}
