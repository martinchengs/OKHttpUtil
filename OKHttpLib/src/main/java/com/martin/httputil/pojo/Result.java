package com.martin.httputil.pojo;

/**
 * Desc:
 * Author:Martin
 * Date:2016/7/14
 */
public class Result<T> {
    public String code;
    public T data;
    public String msg;
    public boolean success;

    public boolean isSuccess() {
        return String.valueOf(200).endsWith(code);
    }
}
