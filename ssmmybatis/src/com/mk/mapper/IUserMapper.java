package com.mk.mapper;

import java.util.List;

import com.mk.bean.User;

public interface IUserMapper {
	
	/**
	 * 查询用户
	 * 方法名：findUsers<br/>
	 * 创建人：xuchengfeifei <br/>
	 * 时间：2017年11月22日-上午10:38:22 <br/>
	 * 手机:15074816437<br/>
	 * @return List<User><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<User> findUsers();
}
