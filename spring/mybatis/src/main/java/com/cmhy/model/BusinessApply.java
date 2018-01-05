package com.cmhy.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BusinessApply {
	private Integer id;
	private String name;
	private String businessNo;
	private String businessType;
	private Integer businessSum;
	private Address address;
	private List<Address> list;
}
