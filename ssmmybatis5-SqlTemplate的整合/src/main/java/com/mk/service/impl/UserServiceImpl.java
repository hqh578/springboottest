package com.mk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mk.bean.User;
import com.mk.dao.IUserDao;
import com.mk.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	/*@Autowired
	//@Qualifier("userDaoImpl")
	@Qualifier("userDao")
	public IUserDao userDao ;*/
	
	
	public IUserDao userDao ;
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}


	public List<User> findUsers() {
		return userDao.findUsers();
	}

}
