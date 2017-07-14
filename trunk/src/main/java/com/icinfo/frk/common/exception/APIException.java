package com.icinfo.frk.common.exception;

/**
 * 自定义接口调用异常
 * Created by yushunwei on 2017-07-11.
 */
public class APIException extends Exception {

    // 错误编码
    private String errorCode;

    public APIException(String message){
        super(message);
    }

    public APIException(String errorCode,String message){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
