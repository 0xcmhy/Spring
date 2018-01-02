package com.cmhy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cmhy.model.BusinessApply;

import lombok.Setter;
@Setter
public class BusinessApplyDaoImpl implements BusinessApplyDao{
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public BusinessApply findByNo(String businessNo) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BusinessApply ba = sqlSession.selectOne("businessApply.findByNo",businessNo);
		sqlSession.close();
		return ba;
	}
	@Override
	public List<BusinessApply> findByName(String name) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BusinessApply>  list = sqlSession.selectList("businessApply.findByName", name);
		sqlSession.close();
		return list;
	}
	@Override
	public List<Integer> findIdByName(String name) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Integer> list = sqlSession.selectList("businessApply.findIdByName", name);
		sqlSession.close();
		return list;
	}
	@Override
	public void updateById(Integer id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("businessApply.updateById", id);
		sqlSession.commit();
		sqlSession.close();
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("businessApply.deleteById", id);
		sqlSession.commit();
		sqlSession.close();
	}

}
