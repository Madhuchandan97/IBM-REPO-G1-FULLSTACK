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

import com.ibm.bean.Admin;
import com.ibm.configuration.JDBCConfiguration;
import com.ibm.mapper.AdminMapper;

/**
 * @author 003NZ1744
 *
 */
@Repository
public class AdminDaoImpl implements AdminDao {

	 Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);
		
		// DI injection of JDBCTemplate
		
		/*
		 * @Autowired private JdbcTemplate jdbcTemplateObject;
		 */
	    @Autowired
	    JDBCConfiguration jdbcConfiguration;
		
		@Override
		@Transactional
		public void create(String studreg, String course) {
			// TODO Auto-generated method stub
			
			
			String SQL = "insert into employee (studreg, age) values (?, ?)";
		      
			jdbcConfiguration.jdbcTemplate().update( SQL, studreg, course);
		 System.out.println("Created Record Studreg = " + studreg + " Course = " + course);
		
		 return;
			
		}

		@Override
		public Admin getAdmin(Integer adminid) {
			// TODO Auto-generated method stub
			
			String SQL = "select * from admin where adminid = ?";
			Admin admin =jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{adminid}, new AdminMapper());
		      logger.debug("value",jdbcConfiguration.jdbcTemplate().queryForObject(SQL, 
		                        new Object[]{adminid}, new AdminMapper()));;
		      logger.debug("value of adm-->" +admin.toString());
		      return admin;
		}

		@Override
		@Transactional
		public List<Admin> listAdmins() {
			// TODO Auto-generated method stub
			 String SQL = "select * from admin";
		      List <Admin> admins = jdbcConfiguration.jdbcTemplate().query(SQL, 
		                                new AdminMapper());
		    	      logger.debug("in debug");
		      return admins;
		}

		
				
		@Override
		public void delete(Integer adminid) {
			// TODO Auto-generated method stub
			
			 String SQL = "delete from employee where adminid = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, adminid);
		      System.out.println("Deleted Record with ADMINID = " + adminid );
		      return;
		}

		@Override
		public void update(Integer adminid, String course) {
			// TODO Auto-generated method stub
			 String SQL = "update admin set age = ? where adminid = ?";
			 jdbcConfiguration.jdbcTemplate().update(SQL, course, adminid);
		      System.out.println("Updated Record with ADMINID = " + adminid );
		      return;
		}
}
