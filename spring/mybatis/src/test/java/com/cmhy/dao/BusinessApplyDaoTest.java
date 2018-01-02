package com.cmhy.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cmhy.mapper.BusinessApplyMapper;

public class BusinessApplyDaoTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void sqlSessionFactory() throws IOException {
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
	}
	@Test
	public void testFindByNo() {
		
	}

	@Test
	public void testFindByName() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
		baMapper.findByName("个贷");
		System.out.println("***********"+baMapper.findByName("个贷"));
		sqlSession.close();
	}

	@Test
	public void testFindIdByName() {
	}

	@Test
	public void testUpdateById() {
	}

	@Test
	public void testDeleteById() {
	}

}
