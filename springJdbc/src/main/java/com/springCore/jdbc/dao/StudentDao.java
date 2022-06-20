package com.springCore.jdbc.dao;

import java.util.List;

import com.springCore.jdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(Integer studentId);
	public Student getStudent(int StudentId);
	public List<Student> getAllStudent();

}
