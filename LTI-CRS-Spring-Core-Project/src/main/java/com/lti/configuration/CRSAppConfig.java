/**
 * 
 */
package com.lti.configuration;

import org.springframework.context.annotation.Import;

/**
 * @author 003NZ1744
 *
 */
@Import({AdminConfig.class,ProfessorConfig.class,StudentConfig.class,UserConfig.class})
public class CRSAppConfig {

}
