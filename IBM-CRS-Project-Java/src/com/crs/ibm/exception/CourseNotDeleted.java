/**
 * 
 */
package com.crs.ibm.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseNotDeleted extends Exception{
	 private int courseid;
	   public  CourseNotDeleted(int courseid) {
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
