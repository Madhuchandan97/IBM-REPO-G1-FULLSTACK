/**
 * 
 */
package com.lti.configuration;

import org.springframework.context.annotation.Bean;

import com.lti.service.UserInterface;
import com.lti.service.UserService;



/**
 * @author 003NZ1744
 *
 */
public class UserConfig {
	@Bean(name="UserBean")
	public UserInterface userInterface ()
	{
		return new UserService();
	}
}
