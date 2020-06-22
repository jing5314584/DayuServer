package com.dayu.server.component;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * json请求时，如果body包含header，则剥除
 * 顺便 输出对应url 请求体，响应体，耗时
 */
@Aspect
@Order(5)
@Component
public class LogFilter{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.dayu.server.controller..*.*(..))")
    public void controllerLog() {
    }

    @Before("controllerLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 只记录post方法
        if("POST".equals(request.getMethod())){
            // 记录下请求内容
            logger.info("URL : " + request.getRequestURL() + "  参数："+JSON.toJSONString(joinPoint.getArgs()));
            //logger.info("请求IP : " + request.getRemoteAddr());
            //logger.info("请求方法 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            //logger.info("请求参数 : " + JSON.toJSONString(joinPoint.getArgs()));
            // 获取参数, 只取自定义的参数, 自带的HttpServletRequest, HttpServletResponse不管
            /*if (joinPoint.getArgs().length > 0) {
                for (Object o : joinPoint.getArgs()) {
                    if (o instanceof HttpServletRequest || o instanceof HttpServletResponse) {
                        continue;
                    }
                    logger.info("请求参数 : " + JSON.toJSONString(o));
                }
            }*/
        }
    }

    @AfterReturning(returning = "ret", pointcut = "controllerLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
      //  logger.info("返回 : " + JSON.toJSONString(ret));
    }
}