/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class MySQLIntegrityConstraintViolationException extends Exception {
	public  MySQLIntegrityConstraintViolationException()
	 {
		 System.out.println("course Not Added Exception");
	 }
	 public MySQLIntegrityConstraintViolationException(String message)
	 {
		 super(message);
	 }
}
