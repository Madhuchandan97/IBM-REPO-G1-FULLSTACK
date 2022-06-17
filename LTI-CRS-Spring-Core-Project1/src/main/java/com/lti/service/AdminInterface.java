/**
 * 
 */
package com.lti.service;

import com.lti.exception.CourseNotDeletedException;
import com.lti.exception.MySQLIntegrityConstraintViolationException;
import com.lti.exception.ProfessorNotAddedException;
import com.lti.exception.StudentNotFoundException;

/**
 * @author 003NZ1744
 *
 */
public interface AdminInterface {

	public void genreportcard();
	public void addprof() throws ProfessorNotAddedException;
	public void studreg()throws StudentNotFoundException ;
	public void courseadd()throws MySQLIntegrityConstraintViolationException;
	public void courserem()throws CourseNotDeletedException;

}
