package com.example.scs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scs.model.UserFeedback;
import com.example.scs.model.UserRegistration;

@Repository
public interface FeedbackDao extends JpaRepository<UserFeedback, Integer> {

}