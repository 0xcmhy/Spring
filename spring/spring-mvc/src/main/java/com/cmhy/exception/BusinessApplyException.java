package com.cmhy.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessApplyException extends Exception  {
	public String message;

	public BusinessApplyException(String message) {
		super();
		this.message = message;
	}
	
}
