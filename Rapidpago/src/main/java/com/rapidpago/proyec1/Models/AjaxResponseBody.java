package com.rapidpago.proyec1.Models;

import java.util.List;

public class AjaxResponseBody {

    String msg;
    List<Employee> result;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Employee> getResult() {
		return result;
	}
	public void setResult(List<Employee> result) {
		this.result = result;
	}

    //getters and setters

}