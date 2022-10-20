package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Student;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Student student() {
		Student bean = new Student();
		return bean;
	}
}
