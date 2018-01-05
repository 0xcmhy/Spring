package com.cmhy.mapper;

import java.util.List;
import java.util.Map;

import com.cmhy.model.BusinessApply;
/**
 * 
 * @author zhangwei
 *
 */
public interface BusinessApplyMapper {
	/**
	 * 
	 * @param businessNo
	 * @return
	 */
	public BusinessApply findByNo(String businessNo);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<BusinessApply> findByName(String name);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Integer> findIdByName(String name);
	public void updateById(Integer id);
	public void deleteById(Integer id);
	public List<BusinessApply> findIdByBa(BusinessApply ba);
	public Integer findCntByName(String name);
	public Integer findCntByNameMap(Map map);
	public Map findBaMapByName(String name);
	public List<BusinessApply> findBaByNameResultMap(BusinessApply ba);
}

