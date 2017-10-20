package com.tutorial6.service;

import java.util.List;

import com.tutorial6.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);

	List<StudentModel> selectAllStudents();

	void addStudent(StudentModel student);

	void deleteStudent(String npm);

	void updateStudent(StudentModel student);
}
