package com.cmhy.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.cmhy.model.BusinessApply;

public class QueryListServlet implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BusinessApply businessApply = new BusinessApply();
		businessApply.setBusinessSum(2000);
		businessApply.setBusinessType("p2p");
		request.setAttribute("businessApply", businessApply);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
