package com.mk.dao;

import java.util.List;

import com.mk.bean.User;

public interface IUserDao {

	public List<User> findUsers();
}
