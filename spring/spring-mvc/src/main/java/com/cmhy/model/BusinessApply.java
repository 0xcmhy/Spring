package com.cmhy.model;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.cmhy.interfaces.ValidatorGroupOne;
import com.cmhy.interfaces.ValidatorGroupSecond;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessApply {
	@NotBlank(message="{NotBlank.businessApply.businessType}",groups= {ValidatorGroupSecond.class})
	@Length(min=6,max=16,message="length error",groups= {ValidatorGroupOne.class})  
	private String businessType;
	@Max(value=20,message="length error")
	private Integer businessSum;
}
