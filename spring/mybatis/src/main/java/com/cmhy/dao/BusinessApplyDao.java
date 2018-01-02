package com.cmhy.dao;

import java.util.List;

import com.cmhy.model.BusinessApply;

public interface BusinessApplyDao {
	public BusinessApply findByNo(String businessNo);
	public List<BusinessApply> findByName(String name);
	public List<Integer> findIdByName(String name);
	public void updateById(Integer id);
	public void deleteById(Integer id);
}
