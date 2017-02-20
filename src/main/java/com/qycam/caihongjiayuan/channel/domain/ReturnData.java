package com.qycam.caihongjiayuan.channel.domain;

/**
 * Created by tom on 16-9-30.
 */
public class ReturnData {
    public int code;
    public String message;
    public Object data;

    public ReturnData(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
