package com.cmhy.mapper;

import java.util.List;

import com.cmhy.model.BusinessApply;

public interface BusinessApplyMapper {
	public BusinessApply findByNo(String businessNo);
	public List<BusinessApply> findByName(String name);
	public List<Integer> findIdByName(String name);
	public void updateById(Integer id);
	public void deleteById(Integer id);
	public List<BusinessApply> findIdByBa(BusinessApply ba);
	public Integer findCntByName(String name);
}

