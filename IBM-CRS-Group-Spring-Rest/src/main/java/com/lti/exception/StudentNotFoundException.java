/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class StudentNotFoundException extends Exception {
	private int studentid;
	public StudentNotFoundException(int studentid)
	{
		this.studentid=studentid;
	}
	public int getstudentid()
	{
		return this.studentid;
	}
	public String getMessage()
	{
		return "student not found"+studentid;
	}

}
