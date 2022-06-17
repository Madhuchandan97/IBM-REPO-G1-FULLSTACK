/**
 * 
 */
package com.crs.ibm.exception;

/**
 * @author 003NZ1744
 *
 */
public class CourseAlreadyRegistered extends Exception {
   private int courseid;
   public  CourseAlreadyRegistered(int courseid) {
	   this.courseid=courseid;
   }
   public int getcourseid()
   {
	   return this.courseid;
   }
   public String getMessage()
    {
	   return "you have already registered to the course"+courseid;
	   }
}
