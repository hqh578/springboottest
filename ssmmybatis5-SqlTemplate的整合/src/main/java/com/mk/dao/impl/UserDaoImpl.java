package com.mk.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mk.bean.User;
import com.mk.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl  implements IUserDao{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<User> findUsers() {
		return sqlSessionTemplate.selectList("com.mk.dao.IUserDao.findUsers");
		
	}

}
