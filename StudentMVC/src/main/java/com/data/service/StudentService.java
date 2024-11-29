package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Student;
import com.data.repository.StudentRepository;

@Service
public class StudentService {
	StudentRepository sti;

	@Autowired
	public StudentService(StudentRepository st) {
		this.sti = st;
	}

	public List<Student> display() {
		return sti.addStudent();
	}

	public String addStudent(Student s) {
		return sti.addOneStudent(s);
	}

	public String addStudents(List<Student> list) {
		return sti.addMultipleStudent(list);
	}

	public Student findStudenById(int id) {
		return sti.findStudentbyId(id);
	}

	public String updateStudent(int id, Student s) {
		return sti.updateStudent(id, s);
	}

	public String deleteStuden(int id) {
		return sti.deleteStudent(id);
	}
}
