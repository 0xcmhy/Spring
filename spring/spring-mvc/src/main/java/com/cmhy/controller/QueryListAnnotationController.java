package com.cmhy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cmhy.interfaces.ValidatorGroupSecond;
import com.cmhy.model.BusinessApply;

@Controller
public class QueryListAnnotationController {
	private static final Logger logger = LoggerFactory.getLogger(QueryListAnnotationController.class);
	@ResponseBody 
	@RequestMapping(value = "queryList",method = RequestMethod.POST)
	public BusinessApply queryList(Date date) {
		logger.debug("queryList begin: at" + System.currentTimeMillis());
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		logger.debug("queryList end: at" + System.currentTimeMillis());
		return businessApply;
	}
	@RequestMapping("/queryListJstl")
	public ModelAndView queryListJstl(Integer id) {
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
	//json
	@RequestMapping("/queryListJson")
	public @ResponseBody BusinessApply queryListJson(@RequestBody BusinessApply businessApply){
		return  businessApply;
	}
	//校验
	@RequestMapping("/queryListValid")
	public @ResponseBody Map<String,String>  queryListValid(@Validated({ValidatorGroupSecond.class}) @RequestBody BusinessApply businessApply,BindingResult bindingResult){
		Map<String,String> map = new HashMap<String, String>();
		if(bindingResult.hasErrors()) {
			map = getErrors(bindingResult);
		} else {
			map.put("success","success");
		}
		return  map;
	}
	private Map<String, String> getErrors(BindingResult result) {
		Map<String, String> map = new HashMap<String, String>();
		List<FieldError> list = result.getFieldErrors();
		for (FieldError error : list) {
			System.out.println("error.getField():" + error.getField());
			System.out.println("error.getDefaultMessage():" + error.getDefaultMessage());

			map.put(error.getField(), error.getDefaultMessage());
		}
		return map;
	}

}
