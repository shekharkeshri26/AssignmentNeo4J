package com.api.assignment.service;

import com.api.assignment.model.PersonJson;

/**
 * Person Service
 * @author shekhar
 *
 */
public interface PersonService {

	/**
	 * Add a new Person
	 * @param personJson
	 * @return person detail
	 */
	PersonJson addPerson(PersonJson personJson);
	
	/**
	 * Get person by id
	 * @param id
	 * @return Person detail
	 */
	PersonJson getPersonById(Long id);

	/**
	 * update a person
	 * @param personJson
	 * @return person detail
	 */
	PersonJson updatePerson(PersonJson personJson);

	/**
	 * delete a person
	 * @param id
	 * @return success message
	 */
	String deletePerson(Long id);

}
