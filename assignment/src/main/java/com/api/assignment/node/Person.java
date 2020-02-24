package com.api.assignment.node;

import java.util.Date;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Person Node
 * @author shekhar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person{

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	private String phoneNumber;
	private Date createDate;
	private Date modifyDate;
	private Location location;
}
