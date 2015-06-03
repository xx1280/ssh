package com.bjsxt.service;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDAO;

import com.bjsxt.model.User;

//Dependency Injection依赖注入
//Inverse of Control控制反转
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService userservice = (UserService)applicationContext.getBean("userService");		
		User user=new User();
		user.setName("5xxxx5");
		userservice.add(user);
		applicationContext.destroy();
	}
	

}
