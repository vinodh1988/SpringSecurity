package com.rest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rest.entity.Person;

public interface PersonDAO extends CrudRepository<Person, Long>{
	@Query("from Person where sno=:sno")  
	Person findPersonById(@Param("sno")int sno);
}
