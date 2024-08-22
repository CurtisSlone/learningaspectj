// package com.aop.aspects;

// public aspect SecurityAspect1 {
//     private Authenticator authenticator = new Authenticator();

// 	pointcut secureAccess()
//         : execution(* MessageCommunicator.deliver(..));

// 	before() : secureAccess() {
// 		System.out.println("Checking and authenticating user");
// 		authenticator.authenticate();
// 	}
// }