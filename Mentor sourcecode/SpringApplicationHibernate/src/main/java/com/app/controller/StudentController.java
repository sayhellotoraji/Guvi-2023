package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Students;
import com.app.service.StudentsService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentsService studentService;
	
	@PostMapping("/save")
	public Students saveStudent(@RequestBody Students student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/get-student/{id}")
	public Optional<Students> getStudentById(@PathVariable Integer id) {
		return studentService.findByStudents(id);
	}

	@GetMapping("/get-students")
	public List<Students> getStudents() {
		return studentService.getStudents();
	}
	
	@PutMapping("/update-student")
	public Students updateStudent(@RequestBody Students std) {
		return studentService.updateStudent(std);
	}
	
	@GetMapping("/get-students-by-name/{name}")
	public Students getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}

	
}
