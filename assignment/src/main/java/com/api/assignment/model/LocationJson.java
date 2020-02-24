package com.api.assignment.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.api.assignment.util.CommonConstants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Location Json
 * @author shekhar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationJson {

	private Long id;

	@NotNull(message=CommonConstants.CITY_NULL_MSG)
	@Size(min = 6, max = 12, message = CommonConstants.CITY_SIZE_MSG)
	private String city;
}
