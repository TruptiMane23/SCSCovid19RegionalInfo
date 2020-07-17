package com.example.scs.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scs.dao.RegistrationDao;
import com.example.scs.model.UserFeedback;
import com.example.scs.model.UserRegistration;
import com.example.scs.util.UserEncrypter;
import com.example.scs.vo.RegistrationVo;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);

	@Autowired
	RegistrationDao registrationDao;

	@Override
	public UserRegistration setUserRegistrationDetails(RegistrationVo vo) throws Exception {
		logger.info("------------------Inside setUserRegistrationDetails Service------------------");

		final String secretKey = "FrankfurtHIS2020";
		UserRegistration userReg = new UserRegistration();
		UserRegistration user;
		try {
			userReg.setFirstName(vo.getFirstName());
			userReg.setLastName(vo.getLastName());
			userReg.setEmailId(vo.getEmailId());
			userReg.setMobileNo(vo.getMobileNo());
			System.out.println("counru.."  +vo.getCountry());
			userReg.setCountry(vo.getCountry());
			System.out.println("stat-" + vo.getState());
			userReg.setState(vo.getState());
			userReg.setCity(vo.getCity());
			System.out.println("usesf" + vo.getUsername());
			userReg.setUsername(vo.getUsername());
			String encryptedString = UserEncrypter.encrypt(vo.getPassword(), secretKey);
			System.out.println("Regist - " + encryptedString);
			userReg.setPassword(encryptedString);

			user = registrationDao.save(userReg);
		} catch (Exception e) {
			logger.error("-------------Exception in setUserRegistrationDetails--------------" + e.getMessage());
			throw new Exception();
		}
		logger.info("------------------Exit setUserRegistrationDetails Service------------------");
		return user;
	}

	@Override
	public UserRegistration verifyUser(RegistrationVo vo) throws Exception {
		logger.info("------------------Inside verifyUser Service------------------");

		final String secretKey = "FrankfurtHIS2020";
		UserRegistration userReg = new UserRegistration();
		UserRegistration user;
		try {
			userReg.setUsername(vo.getUsername());
			String encryptedString = UserEncrypter.encrypt(vo.getPassword(), secretKey);
			System.out.println("passowrd -- "  +encryptedString);
			userReg.setPassword(encryptedString);

			user = registrationDao.verifyUser(userReg.getUsername(), userReg.getPassword());
		} catch (Exception e) {
			logger.error("-------------Exception in setUserRegistrationDetails--------------" + e.getMessage());
			throw new Exception();
		}
		logger.info("------------------Exit verifyUser Service------------------");
		return user;
	}
}
//F1CxuRwxJhrnQ2nTfX9aUg==