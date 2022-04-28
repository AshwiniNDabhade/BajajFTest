package com.api.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.student.entities.InputData;
import com.api.student.entities.Student;
import com.api.student.services.StudentService;

@RestController
@RequestMapping(value = "https://startling-halva-51f71b.netlify.app")

public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	
	
	/*@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> list=studentService.getAllStudents();
		return list;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		Student student=studentService.getStudentById(id);
		return student;
	}
*/	
	@PostMapping("/bfhl")
	public Student addStudent(@RequestBody InputData inputData) {
		Student stud=studentService.addStudent(inputData);
		return stud;
	}
}
