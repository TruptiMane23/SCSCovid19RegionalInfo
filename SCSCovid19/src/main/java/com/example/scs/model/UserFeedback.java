package com.example.scs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Z_USER_FEEDBACK")
public class UserFeedback implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_FEEDBACK_ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer userFeedbackId;

	@Column(name = "USER_ID")
	public Integer userId;

	@Column(name = "EMAIL_ID")
	public String emailId;

	@Column(name = "MOBILE_NO")
	public String mobileNo;

	@Column(name = "UNDERSTANDABILITY")
	public Integer understandability;

	@Column(name = "RELIABILITY")
	public Integer reliability;

	@Column(name = "AVG_RATING")
	public Float avgRating;

	@Column(name = "ADDITIONAL_COMMENTS")
	public String additionalComments;

	public Integer getUserFeedbackId() {
		return userFeedbackId;
	}

	public void setUserFeedbackId(Integer userFeedbackId) {
		this.userFeedbackId = userFeedbackId;
	}	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setReliability(Integer reliability) {
		this.reliability = reliability;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getUnderstandability() {
		return understandability;
	}

	public void setUnderstandability(Integer understandability) {
		this.understandability = understandability;
	}

	public Integer getReliability() {
		return reliability;
	}

	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}

	public String getAdditionalComments() {
		return additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

}
