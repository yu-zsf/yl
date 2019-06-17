package com.yl.user.utils;

public enum ReturnMessage {
	

	success("0","成功"),
	fail("1","失败"),
	;
	private String code;
	private String msg;
	ReturnMessage(String code, String msg) {
		this.code = code;
		this.msg = msg;
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
	
}
