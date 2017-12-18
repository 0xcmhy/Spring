package com.cmhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cmhy.model.BusinessApply;
@Controller
public class QueryListAnnotationController {
	@RequestMapping("/queryList")
	public String queryList() {
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		return "/index.jsp";
	}
	@RequestMapping("/queryListJstl")
	public ModelAndView queryListJstl() {
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("businessApply",businessApply);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
