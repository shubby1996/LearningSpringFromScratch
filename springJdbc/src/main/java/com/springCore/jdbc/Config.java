package com.springCore.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springCore.jdbc.dao.StudentDao;
import com.springCore.jdbc.dao.StudentDaoImplementation;


@Configuration
@ComponentScan("com.springCore.jdbc")
public class Config {
	
	@Bean("dataSourcebean")
	public DataSource getDataSource() {
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dSource.setUsername("root");
		dSource.setPassword("root");
		return dSource;
	}
	
	@Bean("template")
	public JdbcTemplate geTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean("studentDaoImplementation")
//	public StudentDao getStudentDao() {
//		StudentDaoImplementation studentDao = new StudentDaoImplementation();
//		studentDao.setTemplate(geTemplate());
//		return studentDao;
//	}
//	

}
