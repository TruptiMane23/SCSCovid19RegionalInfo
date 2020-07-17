package com.example.scs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scs.model.UserRegistration;

@Repository
public interface RegistrationDao extends JpaRepository<UserRegistration, Integer> {

	@Query("from UserRegistration user where user.username = :username and user.password =:password")
	public UserRegistration verifyUser(@Param("username") String username, @Param("password") String password);

}