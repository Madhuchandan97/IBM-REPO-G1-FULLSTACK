/**
 * 
 */
package com.lti.configuration;

import org.springframework.context.annotation.Bean;

import com.lti.service.StudentInterface;
import com.lti.service.StudentService;


/**
 * @author 003NZ1744
 *
 */
public class StudentConfig {
	@Bean(name="StudentBean")
	public StudentInterface studentInterface ()
	{
		return new StudentService();
	}
}
