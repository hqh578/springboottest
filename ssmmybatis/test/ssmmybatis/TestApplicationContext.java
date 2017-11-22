package ssmmybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mk.bean.User;
import com.mk.mapper.IUserMapper;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserMapper userMapper = context.getBean(IUserMapper.class);
		System.out.println("第一次执行");
		List<User> users1 = userMapper.findUsers();
		System.out.println("第二次执行");
		List<User> users2 = userMapper.findUsers();
		
		
		
//		SqlSessionFactory sessionFactory = context.getBean(SqlSessionFactory.class);
//		SqlSession session = sessionFactory.openSession();
//		IUserMapper userMapper = session.getMapper(IUserMapper.class);
//		System.out.println("1:执行了SQL语句====>");
//		List<User> users = userMapper.findUsers();
//		for (User user : users) {
//			System.out.println(user.getUsername());
//		}
//		//清空缓存
//		//session.clearCache();
//		System.out.println("2:查询第二次。不会打印sql语句");
//		List<User> users2 = userMapper.findUsers();
//		for (User user : users2) {
//			System.out.println(user.getUsername());
//		}
		
		
	}
}
