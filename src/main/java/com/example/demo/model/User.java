package com.example.demo.model;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer userId;
    @NotBlank
	//@Email
	@Size(min=3, max=20)
	private String userName;
    @NotBlank
	@Size(min=6, max=10)
	private String password;
	private String createDate;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}