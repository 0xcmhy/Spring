package com.cmhy.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cmhy.model.BusinessApply;

@Controller
public class QueryListAnnotationController {
	private static final Logger logger = LoggerFactory.getLogger(QueryListAnnotationController.class);
	@RequestMapping("queryList")
	public String queryList() {
		logger.debug("queryList begin: at" + System.currentTimeMillis());
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		logger.debug("queryList end: at" + System.currentTimeMillis());
		return "index";
	}
	@RequestMapping("/queryListJstl")
	public ModelAndView queryListJstl() {
		List<BusinessApply>  list = new ArrayList<BusinessApply>();
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		list.add(businessApply);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","123");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
