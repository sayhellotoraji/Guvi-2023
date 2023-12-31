package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.domain.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

	@Query("from Students where name =:name")
	public Students getStudentByName(String name);
	
}