package com.bjsxt.service;
import java.sql.Time;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.dao.LogDao;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.Log;
import com.bjsxt.model.User;


@Component("userService")
public class UserService {
	private UserDAO userDAO;  
	private LogDao logDAO;
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
	//
//	@Transactional(readOnly= true)
	public void add(User user) {
		userDAO.save(user);
		Log log =new Log();
		log.setMsg("save a User at "+new Date());
		logDAO.save(log);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public LogDao getLogDAO() {
		return logDAO;
	}
	@Resource
	public void setLogDAO(LogDao logDAO) {
		this.logDAO = logDAO;
	}	
}
