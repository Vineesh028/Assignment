package com.user.portal.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public * com.user.portal..*.*(..))")
	public void publicMethods() {
	}

	@Around("publicMethods()")
	public Object logMethodEntryAndExit(ProceedingJoinPoint joinPoint) throws Throwable {

		Object[] args = joinPoint.getArgs();

		log.debug("Entering method [{}] with arguments: {}", joinPoint.getSignature(), Arrays.toString(args));

		Object result = joinPoint.proceed();

		log.debug("Exiting method [{}] with result: {}", joinPoint.getSignature(), result);

		return result;
	}

	@Around("publicMethods()")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();

		Object result = joinPoint.proceed();

		long elapsedTime = System.currentTimeMillis() - startTime;
		log.debug("Method [{}] executed in {} ms", joinPoint.getSignature(), elapsedTime);
		return result;
	}

	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void requestMappingMethods() {
	}

	@Around("requestMappingMethods()")
	public Object logRequestAndResponse(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		log.debug("Request: {} {} - Parameters: {}", request.getMethod(), request.getRequestURI(),
				request.getParameterMap());
		Object result = joinPoint.proceed();
		if (result instanceof ResponseEntity) {
			ResponseEntity<?> responseEntity = (ResponseEntity<?>) result;
			log.debug("Response: Status {} - Body: {}", responseEntity.getStatusCode(), responseEntity.getBody());
		}
		return result;
	}

}
