package com.cmhy.service;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class BaService {
	private String businessType;
	private Integer businessSum;
	/**
	 * 构造函数注入
	 * @param businessType
	 * @param businessSum
	 */
	public BaService(String businessType, Integer businessSum) {
		super();
		this.businessType = businessType;
		this.businessSum = businessSum;
	}
	/**
	 * setter方式注入
	 */
	public BaService() {
		super();
	}
	
}
