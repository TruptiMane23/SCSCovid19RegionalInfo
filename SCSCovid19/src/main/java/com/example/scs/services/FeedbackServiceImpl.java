package com.example.scs.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scs.dao.FeedbackDao;
import com.example.scs.model.UserFeedback;
import com.example.scs.vo.FeedbackVo;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	private static final Logger logger = LoggerFactory.getLogger(FeedbackServiceImpl.class);

	@Autowired
	FeedbackDao feedbackDao;
	
	@Override
	public UserFeedback userFeedback(FeedbackVo vo) throws Exception {
		logger.info("------------------Inside userFeedback Service------------------");

		UserFeedback userReg = new UserFeedback();
		UserFeedback user;
		try {
			System.out.println("under.." + vo.getUnderstandability());
			System.out.println("reliable" + vo.getReliability());
			System.out.println("avg.." + vo.getAvgRating());
			
			userReg.setUserId(vo.getUserId());
			userReg.setEmailId(vo.getEmailId());
			userReg.setMobileNo(vo.getMobileNo());
			userReg.setUnderstandability(vo.getUnderstandability());
			userReg.setReliability(vo.getReliability());
			userReg.setAvgRating((float) ((vo.getUnderstandability()+vo.getReliability())/2));
			userReg.setAdditionalComments(vo.getAdditionalComments());
			
			user = feedbackDao.save(userReg);
		} catch (Exception e) {
			logger.error("-------------Exception in userFeedback--------------" + e.getMessage());
			throw new Exception();
		}
		logger.info("------------------Exit userFeedback Service------------------");
		return user;
	}

}
