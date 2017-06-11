package com.github.codedrinker.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by codedrinker on 09/06/2017.
 */
public class VimeoResult<T> {
    private boolean success = false;
    private T data;
    private String message;
    private String suffix;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
