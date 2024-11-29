package com.data.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.data.Student;

@Repository
public class StudentImpl implements StudentRepository {

	private List<Student> list;

	public StudentImpl() {
		list = new ArrayList<>();
		// Initial records added only once when the repository is instantiated
		list.add(new Student(1, "Dhiraj", "Java", "dhiraj@gmail.com", "Male"));
		list.add(new Student(2, "Vaibhav", "Python", "vaibhav@gmail.com", "Male"));
		list.add(new Student(3, "Harshada", "C++", "harshada@gmail.com", "Female"));
		list.add(new Student(4, "Shruti", "Javascript", "shruti@gmail.com", "Female"));
	}

	@Override
	public List<Student> addStudent() {
		// Simply return the list without adding records
		return list;
	}

	@Override
	public String addOneStudent(Student s) {
		list.add(s); // Add new student to the existing list
		return "Student Added Successfully";
	}

	@Override
	public String addMultipleStudent(List<Student> s) {
		list.addAll(s);
		return "Students Added Successfully";
	}

	@Override
	public Student findStudentbyId(int id) {
		for (Student s : list) {
			if (s.getSid() == id) {
				return s;
			}
		}
		return null;

	}

	@Override
	public String updateStudent(int id, Student s) {
		for (Student s2 : list) {
			if (s2.getSid() == id) {
				if (s != null) {
					if (s.getSid() != 0) {
						s2.setSid(s.getSid());
					}
					if (s.getGender() != null) {
						s2.setName(s.getName());
					}
					if (s.getName() != null) {
						s2.setName(s.getName());
					}
					if (s.getEmail() != null) {
						s2.setEmail(s.getEmail());
					}
				}
				return "Record Updated";
			}
		}
		return "Record Not Found";
	}

	@Override
	public String deleteStudent(int id) {
		for (Student s : list) {
			if (s.getSid() == id) {
				list.remove(s);
				return "Record Deleted";
			}
		}
		return "Record Not Found";
	}
}
