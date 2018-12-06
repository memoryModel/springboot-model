package com.mac.springbootjdbc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 响应数据格式封装
 */
public class MsgResponse implements Serializable {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private Integer status;
    private String message;
    private Map<String,Object> data;

    public MsgResponse(){
        this.status = 200;
        this.message = "success";
        this.data = new HashMap<String, Object>();
    }
    public MsgResponse(Integer status, String message){
        this.status = status;
        this.message = message;
        this.data = new HashMap<String, Object>();
    }

    public MsgResponse(Integer status, String message, Map<String,Object> data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public MsgResponse(Map<String,Object> data){
        this.status = 200;
        this.message = "success";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Map<String, Object> getData() {
        return data;
    }
    public void setData(Map<String, Object> data) {
        this.data = data;
    }




}
