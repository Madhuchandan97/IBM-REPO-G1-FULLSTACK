/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class ProfessorNotAddedException extends Exception {
	 public  ProfessorNotAddedException()
	 {
		 System.out.println("Professor Not Added Exception");
	 }
	 public ProfessorNotAddedException(String message)
	 {
		 super(message);
	 }

	}
