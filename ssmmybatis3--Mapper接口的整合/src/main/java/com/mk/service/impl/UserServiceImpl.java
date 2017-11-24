package com.mk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mk.bean.User;
import com.mk.dao.IUserMapper;
import com.mk.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier("user")
	public IUserMapper userDao ;
	
	public List<User> findUsers() {
		return userDao.findUsers();
	}

}
