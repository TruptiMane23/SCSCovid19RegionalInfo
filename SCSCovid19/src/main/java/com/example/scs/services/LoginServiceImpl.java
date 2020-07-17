package com.example.scs.services;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String getName() {
		System.out.println("Inside servcie");
		return "Mane1";
	}
	

}
