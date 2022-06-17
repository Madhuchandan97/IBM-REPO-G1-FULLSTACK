/**
 * 
 */
package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Student;

/**
 * @author 003NZ1744
 *
 */
public interface StudentDao {

	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   
	   public void create(String name, String course, String batch);
	   
	   public Student getStudent(Integer studid);
	  
	   public List<Student> listStudents();
	  
	   public void delete(Integer studid);
	  
	   public void update(Integer studid, String course);
}
