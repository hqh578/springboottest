package com.mk.web;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mk.bean.User;
import com.mk.mapper.IUserMapper;

@Controller
public class UserController implements ApplicationContextAware{

	private ApplicationContext context;
	
	@ResponseBody
	@RequestMapping("/cache1")
	public String cache(){
		SqlSessionFactory sessionFactory = context.getBean(SqlSessionFactory.class);
		SqlSession session = sessionFactory.openSession();
		IUserMapper userMapper = session.getMapper(IUserMapper.class);
		System.out.println("1:执行了SQL语句====>");
		List<User> users = userMapper.findUsers();
		return "success";
	}
	
	@ResponseBody
	@RequestMapping("/cache2")
	public String cache2(){
		SqlSessionFactory sessionFactory = context.getBean(SqlSessionFactory.class);
		SqlSession session = sessionFactory.openSession();
		IUserMapper userMapper = session.getMapper(IUserMapper.class);
		System.out.println("1:执行了SQL语句====>");
		List<User> users = userMapper.findUsers();
		return "success";
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
}
