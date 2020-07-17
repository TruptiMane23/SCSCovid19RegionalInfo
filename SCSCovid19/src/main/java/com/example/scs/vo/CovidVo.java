package com.example.scs.vo;

import org.springframework.stereotype.Component;

@Component
public class CovidVo {

	public String userId;
	public String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
