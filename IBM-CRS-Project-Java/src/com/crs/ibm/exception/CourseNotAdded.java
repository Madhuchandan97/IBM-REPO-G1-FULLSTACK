/**
 * 
 */
package com.crs.ibm.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseNotAdded extends Exception{
	 private int courseid;
	   public  CourseNotAdded(int courseid) {
		   this.courseid=courseid;
	   }
	   public int getcourseid()
	   {
		   return courseid;
	   }
	   public String getMessage()
	    {
		   return " course not found"+courseid;
		   }
}
