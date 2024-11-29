package com.data.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.data.Student;
import com.data.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MyController {

	StudentService sts;

	@Autowired
	public MyController(StudentService st) {
		this.sts = st;
	}

	@GetMapping("/display")
	public List<Student> display() {
		return sts.display();
	}

	@PostMapping("/sss")
	public String addStudent(@RequestBody Student s) {
		return sts.addStudent(s);
	}

	@PostMapping("/addStudents")
	public String AddStudents(@RequestBody List<Student> s) {
		return sts.addStudents(s);
	}

	@GetMapping("/findbyid")
	public Student findbyid(@RequestParam int id) {
		return sts.findStudenById(id);
	}

	@PutMapping("/updatestud")
	public String updateStudent(@RequestParam int id, @RequestBody Student s) {
		return sts.updateStudent(id, s);
	}

	@DeleteMapping("/delete")
	public String deleteStud(@RequestParam int id) {
		return sts.deleteStuden(id);
	}
}
