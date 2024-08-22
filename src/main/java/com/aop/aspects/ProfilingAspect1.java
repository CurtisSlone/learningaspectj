// package com.aop.aspects;

// public aspect ProfilingAspect {

//     pointcut publicoperation(): execution(public * *.*(..));

//     Object around(): publicoperation(){
//         long start = System.nanoTime();
//         Object ret = proceed();
//         long end = System.nanoTime();
//         System.out.println(thisJoinPointStaticPart.getSignature());
//         return ret;
//     }
// }
