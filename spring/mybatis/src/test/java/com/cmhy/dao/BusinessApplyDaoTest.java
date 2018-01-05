package com.cmhy.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
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
//
//
//	public void testFindByName() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
//		baMapper.findByName("个贷");
//		System.out.println("***********"+baMapper.findByName("个贷"));
//		System.out.println("***********"+baMapper.findByName("个贷").get(0).getAddress().getCity());
//		sqlSession.close();
//	}
//	
//	public void testFindIdByCity() {
//		String city = "上海";
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		BusinessApplyMapper businessapplyMapper = sqlSession.getMapper(BusinessApplyMapper.class);
//		BusinessApply ba = new BusinessApply();
//		Address addr = new Address();
//		addr.setCity(city);
//		ba.setAddress(addr);
//		List<BusinessApply> List =  businessapplyMapper.findIdByBa(ba);
//		sqlSession.close();
//		List.forEach(System.out::println);
//	}
//	
//	public void findCntByName() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
//		System.out.println(baMapper.findCntByName("个贷"));	
//		sqlSession.close();
//	}
//	
//	public void findCntByNameMap() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		HashMap map = new HashMap<>();
//		map.put("name", "个贷");
//		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
//		System.out.println(baMapper.findCntByNameMap(map));	
//		sqlSession.close();
//	}
//	
//	public void findBaMapByName() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
//		System.out.println(baMapper.findBaMapByName("个贷"));
//		sqlSession.close();
//	}
	@Test
	public void findBaByNameResultMap() {
		// TODO Auto-generated method stub
		Address addr1 = new Address();
		Address addr2 = new Address();
		List<Address> list = new ArrayList<Address>();
		list.add(addr1);
		list.add(addr2);
		addr1.setCity("上海");
		addr2.setCity("北京");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BusinessApplyMapper baMapper = sqlSession.getMapper(BusinessApplyMapper.class);
		BusinessApply ba = new BusinessApply();
		ba.setName("个贷");
		ba.setList(list);
		System.out.println(baMapper.findBaByNameResultMap(ba));
		sqlSession.close();
	}
}
