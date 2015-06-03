package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.sql.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bjsxt.dao.LogDao;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.Log;
import com.bjsxt.model.User;

@Component
@Scope("singleton")
public class LogDAOImpl implements LogDao {
	private int id;
	private SessionFactory sessionFactory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString(){
		return "UserDaoIDusercopey="+id;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Log log) {
		
		System.out.println("sadsaddas");
		Session s=sessionFactory.getCurrentSession();
		s.save(log);
		System.out.println("日志保存成功");
	//	throw new RuntimeException("erro1r");

	}
}
