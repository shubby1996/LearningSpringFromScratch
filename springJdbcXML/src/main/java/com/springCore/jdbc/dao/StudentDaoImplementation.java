package com.springCore.jdbc.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springCore.jdbc.entities.Student;

public class StudentDaoImplementation implements StudentDao {
	
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
      String query = "insert into student (id, name, city) values(?,?,?)";
      int res = this.template.update(query,student.getId(),student.getName(),student.getCity());
      return res;
	}

	public int update(Student student) {
		String query = "update student set name=? , city=? where id=?";
	    int res = this.template.update(query,student.getName(),student.getCity(),student.getId());
	    return res;
	}

	public int delete(Integer studentId) {
		String query = "delete from student where id=?";
	    int res = this.template.update(query,studentId);
	    return res;
	}

	public Student getStudent(int StudentId) {
		
		String query = "Select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImplementation();
		Student student = this.template.queryForObject(query,rowMapper,StudentId);
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> listOfStudents = new ArrayList<Student>(); 
		String query = "Select * from student";
		RowMapper<Student> rowMapper = new RowMapperImplementation();
		listOfStudents = this.template.query(query, rowMapper);
		return listOfStudents;
	}

	
}
