package com.example.scs.forms;

import java.io.Serializable;

import com.example.scs.vo.RegistrationVo;

public class RegistrationForm implements Serializable {

	private static final long serialVersionUID = 1L;

	RegistrationVo registrationVo = new RegistrationVo();

	public RegistrationForm() {
		registrationVo = new RegistrationVo();
	}

	public RegistrationVo getRegistrationVo() {
		return registrationVo;
	}

	public void setRegistrationVo(RegistrationVo registrationVo) {
		this.registrationVo = registrationVo;
	}

}
