package com.bjsxt.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class LogInterceptor {
	
	public void before(){
		System.out.println("method Start");
	}
	public void AfterReturning(){
		System.out.println("method Stop");
	}
}
