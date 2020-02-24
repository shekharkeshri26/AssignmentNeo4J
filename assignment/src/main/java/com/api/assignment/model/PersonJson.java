package com.api.assignment.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.api.assignment.util.CommonConstants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Person Json
 * @author shekhar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonJson {

	private Long id;

	@NotNull(message=CommonConstants.NAME_NULL_MSG)
	@Size(min=3,max=20, message=CommonConstants.NAME_SIZE_MSG)
	private String name;
	
	@NotNull(message=CommonConstants.EMAIL_NULL_MSG)
	@Email(message=CommonConstants.EMAIL_INVALID_MSG)
	private String email;
	
	@NotNull(message=CommonConstants.PHONE_NULL_MSG)
	@Size(min=6,max=12, message=CommonConstants.PHONE_NUMBER_SIZE_MSG)
	private String phoneNumber;
	
	private String createDate;
	private String modifyDate;
	private LocationJson location;
}
