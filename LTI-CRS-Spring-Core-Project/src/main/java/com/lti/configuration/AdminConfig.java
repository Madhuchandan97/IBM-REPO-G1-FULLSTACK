/**
 * 
 */
package com.lti.configuration;

import org.springframework.context.annotation.Bean;

import com.lti.service.AdminInterface;
import com.lti.service.AdminService;



/**
 * @author 003NZ1744
 *
 */
public class AdminConfig {
	@Bean(name="AdminBean")
	public AdminInterface adminInterface()
	{
		return new AdminService();
	}
}
