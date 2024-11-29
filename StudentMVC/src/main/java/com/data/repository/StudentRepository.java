package com.data.repository;

import java.util.List;

import com.data.Student;

public interface StudentRepository {
	public List<Student> addStudent();

	public String addOneStudent(Student s);

	public String addMultipleStudent(List<Student> list);

	public Student findStudentbyId(int id);

	public String updateStudent(int id, Student s);

	public String deleteStudent(int id);
}
