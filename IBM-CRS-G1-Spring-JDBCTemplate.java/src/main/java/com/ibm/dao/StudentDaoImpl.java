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

import com.ibm.bean.Student;
import com.ibm.configuration.JDBCConfiguration;
import com.ibm.mapper.StudentMapper;

/**
 * @author 003NZ1744
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	 Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
		
		// DI injection of JDBCTemplate
		
		/*
		 * @Autowired private JdbcTemplate jdbcTemplateObject;
		 */
	    @Autowired
	    JDBCConfiguration jdbcConfiguration;
		
		@Override
		@Transactional
		public void create(String name, String course , String batch) {
			// TODO Auto-generated method stub
			
			
			String SQL = "insert into student (name, course, batch) values (?, ?, ?)";
		      
			jdbcConfiguration.jdbcTemplate().update( SQL, name, course, batch);
		 System.out.println("Created Record Name = " + name + " Course = " + course + " Batch =" + batch);
		
		 return;
			
		}

		@Override
		public Student getStudent(Integer studid) {
			// TODO Auto-generated method stub
			
			String SQL = "select * from student where studid = ?";
			Student student =jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{studid}, new StudentMapper());
		      logger.debug("value",jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{studid}, new StudentMapper()));;
		      logger.debug("value of std-->" +student.toString());
		      return student;
		}

		@Override
		@Transactional
		public List<Student> listStudents() {
			// TODO Auto-generated method stub
			 String SQL = "select * from student";
		      List <Student> students = jdbcConfiguration.jdbcTemplate().query(SQL, 
		                                new StudentMapper());
		    	      logger.debug("in debug");
		      return students;
		}

		
				
		@Override
		public void delete(Integer studid) {
			// TODO Auto-generated method stub
			
			 String SQL = "delete from student where studid = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, studid);
		      System.out.println("Deleted Record with STUDID = " + studid );
		      return;
		}

		@Override
		public void update(Integer studid, String course) {
			// TODO Auto-generated method stub
			 String SQL = "update student set course = ? where studid = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, course, studid);
		      System.out.println("Updated Record with STUDID = " + studid );
		      return;
		}
}
