package com.cmhy.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })  
public class BusinessApplyServiceTest {
	@Resource
	private BusinessApplyService baService;
	@Resource
	JdbcTemplate jdbcTemplate;
	@Test
	public void test() {
		System.out.println(baService.toString());
		System.out.println(jdbcTemplate);
	}

}
