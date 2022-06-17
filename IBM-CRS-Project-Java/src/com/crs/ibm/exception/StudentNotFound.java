/**
 * 
 */
package com.crs.ibm.exception;

/**
 * @author 003NZ1744
 *
 */
public class StudentNotFound extends Exception {
	private int studentid;
	public StudentNotFound(int studentid)
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
