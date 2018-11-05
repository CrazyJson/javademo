package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Aspect
@Component
public class HttpAspect {
    private final static Logger log = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.example.demo.controller.helloController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();


        log.info("uri={}", request.getRequestURI());

        Enumeration<String> enu = request.getHeaderNames();
        while (enu.hasMoreElements()) {
            String header = enu.nextElement();
            log.info("header:{},value:{}",header,request.getHeader(header));
        }

        log.info("class_name:{}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        log.info("args:{}",joinPoint.getArgs());
        log.info("doBefore method:{},remoteAddr:{}",request.getMethod(),request.getRemoteAddr());
    }

    @After("log()")
    public void doAfter() {
//        log.info("doAfter{}", 2222222);
    }
}
