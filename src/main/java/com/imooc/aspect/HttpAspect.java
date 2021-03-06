package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.conntroller.GirlConntroller.*(..))")
    public void bastlog(){

    }

    @Before("bastlog()")
    public void doBefore() {
        logger.info("111111111");
    }

    @After("bastlog()")
    public void doAfter(){
        logger.info("22222222");
    }


}
