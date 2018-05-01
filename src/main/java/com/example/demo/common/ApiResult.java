//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.common;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 229227289014288108L;
    private Boolean isSuccess = true;
    private String code;
    private String msg;
    private T result;

    public ApiResult() {
        this.code = "0000";
        this.msg = "成功";
    }

    public ApiResult(T result, String code, String msg) {
        this.result = result;
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    /** @deprecated */
    @Deprecated
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApiResult<T> setCodeMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public ApiResult<T> withResult(T result) {
        this.setIsSuccess(true);
        this.setResult(result);
        return this;
    }

    public ApiResult<T> withError(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.setIsSuccess(false);
        return this;
    }

    public static ApiResult<Object> error(String code, String msg) {
        ApiResult<Object> result = new ApiResult();
        result.setIsSuccess(false);
        result.setCodeMsg(code, msg);
        return result;
    }
}
