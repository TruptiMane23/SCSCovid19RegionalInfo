package com.example.scs.services;

import com.example.scs.model.UserRegistration;
import com.example.scs.vo.RegistrationVo;

public interface RegistrationService {

	public UserRegistration setUserRegistrationDetails(RegistrationVo vo) throws Exception;

	public UserRegistration verifyUser(RegistrationVo vo) throws Exception;

}
