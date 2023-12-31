package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.Students;
import com.app.repository.StudentsRepository;

@Service
public class StudentsService {

	@Autowired
	private StudentsRepository studentRepository;
	
	public Students saveStudent(Students std) {
		return studentRepository.save(std);
	}
	
	public Optional<Students> findByStudents(Integer id) {
		return Optional.ofNullable(studentRepository.getById(id));
	}
	
	public List<Students> getStudents(){
		return studentRepository.findAll();
	}
	
	public Students updateStudent(Students std) {
		Students s = studentRepository.getById(std.getId());
		if(s != null) {
			s.setName(std.getName());
			s.setAddress(std.getAddress());
		}
		return studentRepository.save(s);
	}
	
	public Students getStudentByName(String name) {
		return studentRepository.getStudentByName(name);
	}
	
}
