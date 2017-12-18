package com.cmhy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cmhy.model.BusinessApply;

public class QueryListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelAndView = new ModelAndView();
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		modelAndView.addObject("businessApply",businessApply);
		modelAndView.setViewName("/index.jsp");
		return modelAndView;
	}

}
