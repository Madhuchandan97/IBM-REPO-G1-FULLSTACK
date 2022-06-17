/**
 * 
 */
package com.crs.ibm.exception;

/**
 * @author 003NZ1744
 *
 */
public class ProfessorNotAdded extends Exception {
 private int profid;
 public ProfessorNotAdded(int profid)
 {
	 this.profid=profid;
 }
 public int getuserid()
 {
	 return this.profid;
 }
 public String getMessage()
 {
	 return "professor not added"+profid;
 }
}
