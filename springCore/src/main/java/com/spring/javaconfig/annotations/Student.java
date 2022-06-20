package com.spring.javaconfig.annotations;

import org.springframework.stereotype.Component;

@Component
public class Student {

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
