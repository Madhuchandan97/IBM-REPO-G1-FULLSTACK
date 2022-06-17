/**
 * 
 */
package com.lti.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseFoundException extends Exception{
	 private int courseid;
	   public  CourseFoundException(int courseid) {
		   this.courseid=courseid;
	   }
	   public int getcourseid()
	   {
		   return this.courseid;
	   }
	   public String getMessage()
	    {
		   return "course already in the catalog"+courseid;
		   }
}