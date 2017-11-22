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
		System.out.println("��һ��ִ��");
		List<User> users1 = userMapper.findUsers();
		System.out.println("�ڶ���ִ��");
		List<User> users2 = userMapper.findUsers();
		
		
		
//		SqlSessionFactory sessionFactory = context.getBean(SqlSessionFactory.class);
//		SqlSession session = sessionFactory.openSession();
//		IUserMapper userMapper = session.getMapper(IUserMapper.class);
//		System.out.println("1:ִ����SQL���====>");
//		List<User> users = userMapper.findUsers();
//		for (User user : users) {
//			System.out.println(user.getUsername());
//		}
//		//��ջ���
//		//session.clearCache();
//		System.out.println("2:��ѯ�ڶ��Ρ������ӡsql���");
//		List<User> users2 = userMapper.findUsers();
//		for (User user : users2) {
//			System.out.println(user.getUsername());
//		}
		
		
	}
}
