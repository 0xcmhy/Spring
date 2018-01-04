package com.cmhy.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaServiceTest {

	@Test
	public void testSetBusinessType() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BaService baService = (BaService) ctx.getBean("baService");
		System.out.println(baService);
		BaService baService1 = (BaService) ctx.getBean("baService1");
		System.out.println(baService1);
	}

}
