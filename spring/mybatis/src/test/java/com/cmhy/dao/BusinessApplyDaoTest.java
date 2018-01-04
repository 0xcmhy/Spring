package com.cmhy.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cmhy.mapper.BusinessApplyMapper;
import com.cmhy.model.Address;
import com.cmhy.model.BusinessApply;

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


	public void testFindByName() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
		baMapper.findByName("个贷");
		System.out.println("***********"+baMapper.findByName("个贷"));
		System.out.println("***********"+baMapper.findByName("个贷").get(0).getAddress().getCity());
		sqlSession.close();
	}
	@Test
	public void testFindIdByCity() {
		String city = "上海";
		SqlSession sqlSession = sqlSessionFactory.openSession();

		BusinessApplyMapper businessapplyMapper = sqlSession.getMapper(BusinessApplyMapper.class);
		BusinessApply ba = new BusinessApply();
		Address addr = new Address();
		addr.setCity(city);
		ba.setAddress(addr);
		List<BusinessApply> List =  businessapplyMapper.findIdByBa(ba);
		sqlSession.close();
		List.forEach(System.out::println);
	}
	
	public void findCntByName() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
		System.out.println(baMapper.findCntByName("个贷"));	
	}

}
