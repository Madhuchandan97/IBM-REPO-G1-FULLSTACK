/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseAlreadyRegisteredException extends Exception {
	public  CourseAlreadyRegisteredException()
	 {
		 super("Course Already Registered Exception");
	 }
	 public CourseAlreadyRegisteredException(String message)
	 {
		 super(message);
	 }
}

