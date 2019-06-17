package com.yl.user.utils;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PageVO<T> {
	private String code;
	
	private String msg;
	
	private T data;

	public PageVO(String code, String msg) {
		this.code = code;
		this.msg = msg;
		this.data = null;
	}

	
	public static PageVO<?> getSuccessPageVO(){
		return new PageVO<>(ReturnMessage.success.getCode(), ReturnMessage.success.getMsg());
	}
	
	public static PageVO<?> getFailPageVO(){
		return new PageVO<>(ReturnMessage.fail.getCode(), ReturnMessage.fail.getMsg());
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	
	
	
}
