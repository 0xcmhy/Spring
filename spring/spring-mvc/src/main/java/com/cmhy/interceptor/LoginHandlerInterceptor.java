package com.cmhy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginHandlerInterceptor:LoginHandlerInterceptor : preHandle");
		HttpSession session = request.getSession();
		Integer sum = (Integer)request.getAttribute("sum"); 
		if(request.getAttribute("sum") == null) {
			return false;
		} else {
			session.putValue("sum", sum);
			return true;
		}
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginHandlerInterceptor:LoginHandlerInterceptor : postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginHandlerInterceptor:LoginHandlerInterceptor : afterCompletion");
	}

}
