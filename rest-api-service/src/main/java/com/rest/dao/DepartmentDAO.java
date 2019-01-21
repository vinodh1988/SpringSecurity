package com.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.entity.Department;

public interface DepartmentDAO extends CrudRepository<Department, Long> {

}
