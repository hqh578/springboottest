package com.mk.dao;

import java.util.List;

import com.mk.bean.User;

public interface IUserMapper {

	public List<User> findUsers();
}
