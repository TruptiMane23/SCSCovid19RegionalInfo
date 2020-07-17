package com.example.scs.services;

import com.example.scs.model.UserFeedback;
import com.example.scs.vo.FeedbackVo;

public interface FeedbackService {

	UserFeedback userFeedback(FeedbackVo vo) throws Exception;

}