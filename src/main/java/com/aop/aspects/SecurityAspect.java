package com.aop.aspects;

import com.aop.MessageCommunicator;
import com.aop.Authenticator;

public aspect SecurityAspect {
    private Authenticator authenticator = new Authenticator();

	pointcut secureAccess()
        : execution(* MessageCommunicator.deliver(..));

	before() : secureAccess() {
		System.out.println("Checking and authenticating user");
		authenticator.authenticate();
	}
}