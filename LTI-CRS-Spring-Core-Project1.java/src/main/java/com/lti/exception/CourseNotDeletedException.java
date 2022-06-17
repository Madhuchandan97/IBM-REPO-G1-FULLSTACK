/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseNotDeletedException extends Exception{
	public  CourseNotDeletedException()
	 {
		 super("course Not Added Exception");
	 }
	 public CourseNotDeletedException(String message)
	 {
		 super(message);
	 }
}
