package com.mentor.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mentor.hibernate.application.App;
import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.User;

public class MentorServiceDaoImpl  implements MentorServiceDao  {
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean createProfile(Mentor mentor) {
		// TODO Auto-generated method stub
		return false;
	}

	public Mentor viewMyProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Mentor deactivateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void viewProposal() {
		// TODO Auto-generated method stub

	}

	public boolean acceptProposal(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
