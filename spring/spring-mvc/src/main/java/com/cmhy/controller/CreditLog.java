package com.cmhy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class CreditLog {
	@RequestMapping("/login")
	public String logIn(HttpServletRequest request, String userName, String passwrod) {
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName);
		return "login";
	}
	@RequestMapping("/logout")
	public String logOut(HttpServletRequest request, String userName, String passwrod) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}

}
