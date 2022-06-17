/**
 * 
 */
package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Professor;

/**
 * @author 003NZ1744
 *
 */
public interface ProfessorDao {

	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   
	   public void create(String grades, String course);
	   
	   public Professor getProfessor(Integer Professorid);
	  
	   public List<Professor> listProfessors();
	  
	   public void delete(Integer Professorid);
	  
	   public void update(String grades, Integer Professorid);
}
