package com.api.assignment.util;

/**
 * Common Constants file
 * @author shekhar
 *
 */
public class CommonConstants {

	//Neo4j Configuration
	public static final String NEO4J_BASE_PACKAGE = "com.api.assignment.repository";
	public static final String NODE_PACKAGE = "com.api.assignment.node";
	public static final String NEO4J_URI = "bolt://54.174.37.100:33230"; //"bolt://localhost:7687"
	public static final String NEO4J_USER_ID = "neo4j";
	public static final String NEO4J_PASSWORD = "carload-electrician-contamination";
	public static final String NONE = "none";
	
	//Swagger Configuration
	public static final String SWAGGER_BASE_PACKAGE = "com.api.assignment.controller";
	public static final String SWAGGER_TITLE = "Spring Boot REST API";
	public static final String SWAGGER_DESCRIPTION = "Person Management REST API";
	public static final String SWAGGER_LICENSE = "Apache 2.0";
	public static final String SWAGGER_LICENSE_URL = "http://www.apache.org/licenses/LICENSE-2.0.html";
	public static final String SWAGGER_VERSION = "1.0.0";
	
	//Person URLs
	public static final String PERSON_CONTROLLER_URL = "/person/v1";
	public static final String PERSON_ADD_UPDATE_URL = "/person";
	public static final String PERSON_GET_DELETE_URL = "/person/{id}";
	
	//Validation
	public static final String VALIDATION_FAILED = "Validation Failed";
	public static final String MISSING_PARAMETER = "Missing Parameter";
	public static final String NAME_SIZE_MSG = "Name must be greater than 2 characters and less than 20 characters";
	public static final String PHONE_NUMBER_SIZE_MSG = "Phone Number must be greater than 6 characters and less than 12 characters";
	public static final String NAME_NULL_MSG = "Name can't be null";
	public static final String EMAIL_NULL_MSG = "Email can't be null";
	public static final String PHONE_NULL_MSG = "Phone Number can't be null";
	public static final String EMAIL_INVALID_MSG = "Email should be valid";
	public static final String CITY_NULL_MSG = "City Name can't be null";
	public static final String CITY_SIZE_MSG = "City Name must be greater than 3 characters and less than 12 characters";
	
	//Exception
	public static final String MISSING_PERSON_ID = "Person id not found: ";
	
	//Warning
	public static final String UN_CHECKED = "unchecked";
	public static final String RAW_TYPES = "rawtypes";
	
}
