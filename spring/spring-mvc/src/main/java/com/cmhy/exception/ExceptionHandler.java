package com.cmhy.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver{
	private String message;
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mode = new ModelAndView();
		BusinessApplyException  businessApplyException = null;
		// TODO Auto-generated method stub
		if(ex instanceof BusinessApplyException) {
			businessApplyException = (BusinessApplyException) ex;
		} else {
			message = "未知错误";
			businessApplyException = new BusinessApplyException(message);
		}
		mode.addObject("	",businessApplyException.getMessage());
		mode.setViewName("error");
		return mode;
	}

}
