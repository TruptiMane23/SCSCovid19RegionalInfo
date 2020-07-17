package com.example.scs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.scs.constants.CryptParam;
import com.example.scs.util.CovidSession;
import com.example.scs.util.UserEncrypter;
import com.example.scs.vo.CovidVo;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class EntryPointController {

	private static final Logger logger = LoggerFactory.getLogger(EntryPointController.class);
	
	Gson gson = new Gson();

	@Autowired
	CovidSession session;

	@RequestMapping(value = "CovidSession.html")
	public String createUserSession(@RequestParam("data") String data) {
		logger.info("------------------Inside createUserSession------------------");
		
		System.out.println("---------Entry Point Date---------" + data);
		
		CovidVo covidVo = gson.fromJson(UserEncrypter.decrypt(data.replace(" ", "+"), CryptParam.SECRET_KEY), CovidVo.class);
		System.out.println("---------User Id----------" + covidVo.getUserId());
		System.out.println("---------Password----------" + covidVo.getPassword());

	//	session.setUserId(covidVo.getUserId());
	//	session.setPassword(covidVo.getPassword());
		
		logger.info("------------------Exit createUserSession------------------");
		return "index";

	}

}
