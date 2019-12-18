package com.by.happy.chocolate.comm.pojo;

/**
 * Create user:by
 * date:2019/10/21 14:24
 */
public class BaseResponse {

    public static final int SUCCESS_CODE = 1;

    public static final int DEFEATE_CODE = 0;

    private int code;
    private String msg;
    private Object data;

    public BaseResponse(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
