package com.api.assignment.exception;

import com.api.assignment.util.CommonConstants;

/**
 * Person Not Found Exception
 * @author shekhar
 *
 */
public class PersonNotFoundException extends RuntimeException{

	public PersonNotFoundException(Long id) {
		super(CommonConstants.MISSING_PERSON_ID +id);
	}
	
}
