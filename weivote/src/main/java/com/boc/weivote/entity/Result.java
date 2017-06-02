package com.boc.weivote.entity;


import java.io.Serializable;

/**
 * Result : 响应的结果对象
 *
 * @author XavierXu
 * @since 2017-6-1 10:49:24
 */
public class Result implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -466716983102462694L;

	/**
     * 信息
     */
    private String message;

    /**
     * 状态码
     */
    private String statusCode;

    /**
     * 是否成功
     */
    private boolean success;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Result() {

    }
    
    public Result(String statusCode,boolean success,String message){
    	this.statusCode = statusCode;
    	this.success = success;
    	this.message = message;
    }
    public Result(String statusCode,boolean success){
    	this.statusCode = statusCode;
    	this.success = success;
    }
}

