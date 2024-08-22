package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.aop.Authenticator;

@Aspect
public class SecurityAspect {
  private Authenticator authenticator = new Authenticator();

  @Pointcut("execution(* com.aop.MessageCommunicator.deliver(..))")
  public void secureAccess(){
	
  }

  @Before("secureAccess()")
  public void secure(){
	System.out.println("Checking and authenticating user");
	authenticator.authenticate();
  }
}