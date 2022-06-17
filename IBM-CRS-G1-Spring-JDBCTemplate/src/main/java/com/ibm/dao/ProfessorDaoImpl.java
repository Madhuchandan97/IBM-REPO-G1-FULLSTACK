/**
 * 
 */
package com.ibm.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.bean.Professor;
import com.ibm.configuration.JDBCConfiguration;
import com.ibm.mapper.ProfessorMapper;

/**
 * @author 003NZ1744
 *
 */
@Repository
public class ProfessorDaoImpl implements ProfessorDao {

	 Logger logger = LoggerFactory.getLogger(ProfessorDaoImpl.class);
		
		// DI injection of JDBCTemplate
		
		/*
		 * @Autowired private JdbcTemplate jdbcTemplateObject;
		 */
	    @Autowired
	    JDBCConfiguration jdbcConfiguration;
		
		@Override
		@Transactional
		public void create(String grades, String course) {
			// TODO Auto-generated method stub
			
			
			String SQL = "insert into professor (grades, course) values (?, ?)";
		      
			jdbcConfiguration.jdbcTemplate().update( SQL, grades, course);
		 System.out.println("Created Record Grades = " + grades + " Course = " + course);
		
		 return;
			
		}

		@Override
		public Professor getProfessor(Integer professorid) {
			// TODO Auto-generated method stub
			
			String SQL = "select * from professor where professorid = ?";
			Professor professor =jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{professorid}, new ProfessorMapper());
		      logger.debug("value",jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{professorid}, new ProfessorMapper()));;
		      logger.debug("value of prf-->" +professor.toString());
		      return professor;
		}

		@Override
		@Transactional
		public List<Professor> listProfessors() {
			// TODO Auto-generated method stub
			 String SQL = "select * from professor";
		      List <Professor> professors = jdbcConfiguration.jdbcTemplate().query(SQL, 
		                                new ProfessorMapper());
		    	      logger.debug("in debug");
		      return professors;
		}

		
				
		@Override
		public void delete(Integer professorid) {
			// TODO Auto-generated method stub
			
			 String SQL = "delete from professor where professorid = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, professorid);
		      System.out.println("Deleted Record with PROFESSORID = " + professorid );
		      return;
		}

		@Override
		public void update(String grades, Integer professorid) {
			// TODO Auto-generated method stub
			 String SQL = "update professor set professorid = ? where grades = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, professorid, grades);
		      System.out.println("Updated Record with GRADES = " + grades );
		      return;
		}
}
