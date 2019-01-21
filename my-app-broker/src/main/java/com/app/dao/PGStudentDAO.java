package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.model.PGStudent;

public interface PGStudentDAO extends CrudRepository<PGStudent,Long>{

}
