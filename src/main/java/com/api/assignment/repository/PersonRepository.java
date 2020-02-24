package com.api.assignment.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.api.assignment.node.Person;

/**
 * Person Repository
 * @author shekhar
 *
 */
public interface PersonRepository extends Neo4jRepository<Person,Long> {

}
