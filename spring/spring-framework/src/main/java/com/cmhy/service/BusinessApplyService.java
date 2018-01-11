package com.cmhy.service;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Service
public class  BusinessApplyService{
	private String businessType;
	private Integer businessSum;
	/**
	 * 构造函数注入
	 * @param businessType
	 * @param businessSum
	 */
	public BusinessApplyService(String businessType, Integer businessSum) {
		super();
		this.businessType = businessType;
		this.businessSum = 12;
	}
	/**
	 * setter方式注入
	 */
	public BusinessApplyService() {
		super();
	}
	
}
