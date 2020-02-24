package com.api.assignment.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.assignment.model.PersonJson;
import com.api.assignment.service.PersonService;
import com.api.assignment.util.CommonConstants;

@RestController
@RequestMapping(CommonConstants.PERSON_CONTROLLER_URL)
public class PersonController {

	@Autowired
	PersonService personService;
	
	/**
	 * This is the API for adding a new Person
	 * @param personJson
	 * @return the newly added entity 
	 */
	@PostMapping(CommonConstants.PERSON_ADD_UPDATE_URL)
	public ResponseEntity<PersonJson> addPerson(@Valid @RequestBody PersonJson personJson) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.addPerson(personJson));
	}
	
	/**
	 * This is the api to get the person by it's id
	 * @param id
	 * @return Person Json
	 */
	@GetMapping(CommonConstants.PERSON_GET_DELETE_URL)
	public ResponseEntity<PersonJson> getPersonById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.getPersonById(id));
	}

	/**
	 * This is the api to update person detail
	 * @param personJson
	 * @return Person detail
	 */
	@PutMapping(CommonConstants.PERSON_ADD_UPDATE_URL)
	public ResponseEntity<PersonJson> updatePerson(@Valid @RequestBody PersonJson personJson) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.updatePerson(personJson));
	}
	/**
	 * This API is used to delete the Person
	 * @param id
	 * @return Success with id
	 */
	@DeleteMapping(CommonConstants.PERSON_GET_DELETE_URL)
	public ResponseEntity<String> deletePerson(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.deletePerson(id));
	}
}