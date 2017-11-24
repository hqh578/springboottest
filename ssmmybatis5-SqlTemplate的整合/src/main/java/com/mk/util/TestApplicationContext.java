package com.mk.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mk.bean.User;
import com.mk.dao.IUserDao;
import com.mk.dao.impl.UserDaoImpl;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("==============>"+string);
		}*/
		IUserDao userDao = context.getBean(UserDaoImpl.class);
		List<User> users = userDao.findUsers();
		for (User user : users) {
			System.out.println(user.getId());
			System.out.println(user.getUsername());
		}
	}
}
