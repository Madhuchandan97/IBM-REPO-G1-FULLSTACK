/**
 * 
 */
package com.lti.configuration;

import org.springframework.context.annotation.Bean;

import com.lti.service.ProfessorInterface;
import com.lti.service.ProfessorService;


/**
 * @author 003NZ1744
 *
 */
public class ProfessorConfig {
	@Bean(name="ProfessorBean")
	public ProfessorInterface professorInterface ()
	{
		return new ProfessorService();
	}
}
