/**
 * 
 */
package com.lti.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

import com.lti.constant.SQLQueriesConstants;
import com.lti.exception.MySQLIntegrityConstraintViolationException;
import com.lti.exception.CourseNotDeletedException;
import com.lti.exception.ProfessorNotAddedException;
import com.lti.utile.DBUtiles;
import com.mysql.jdbc.Statement;

/**
 * @author 003NZ1744
 *
 */
public class AdminDaoservice implements AdminDaointerface
{
	
	Connection conn = null;
/*
 * Add course using SQL commands
 * trows coursenotadded Exception
 */
   
	/*public String dispalyCurrentDate() {
		Date currentDate =new Date(0);
		LocalDate localDate =LocalDate.now();
		LocalTime localTime =LocalTime.now();
		LocalDateTime localDateTime =LocalDateTime.now();
		
		String pattern ="MM/dd/yyyy HH:mm:ss";
		
		DateFormat df= new SimpleDateFormat(pattern);
		
		Date today= (Date) Calendar.getInstance().getTime();
		
		String todayAsString= df.format(today);
		
		return todayAsString;
   }*/


	public void addcoursemain()throws MySQLIntegrityConstraintViolationException
	{
		 conn=DBUtiles.getConnection();			   
		    PreparedStatement stmts = null;
		  
	
		try{
			   
			   
			      // Execute a query
			    //  System.out.println("Creating statement...");
			   //   String sql="insert into course values(?,?)";
			      
			      stmts = conn.prepareStatement( SQLQueriesConstants.ADD_COURSE_QUERY);
			     int coursei=8;
			     String coursename="sap";
			     ResultSet rs=stmts.executeQuery(SQLQueriesConstants.NEW_COURSE_QUERY);
			     while(rs.next()) {
			    	int cou=rs.getInt("courseid"); 
				if (coursei==cou)
				{  throw new  MySQLIntegrityConstraintViolationException();
				
				}}
			      stmts.setInt(1,coursei);  
			      stmts.setString(2,coursename);
			   //  throw new  MySQLIntegrityConstraintViolationException();
			    //  System.out.println("hi");
					
					  stmts.executeUpdate(); 
					  /*if(g !=2) { System.out.println("hi"); throw
					 * new MySQLIntegrityConstraintViolationException(); //
					 * System.out.println("hi"); }
					 */
			      stmts.close();
			      conn.close();
			      //throw new  MySQLIntegrityConstraintViolationException(); 
				} /*
					 * else { throw new CourseNotAddedException(5); }
					 */
		catch( MySQLIntegrityConstraintViolationException  se){
			throw new MySQLIntegrityConstraintViolationException(); 
		
				  //Handle errors for JDBC
			      //se.printStackTrace();
			   }catch(Exception  e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmts!=null)
			            stmts.close();
			      }catch(SQLException se2){
			    	 
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			  
			  
	}
	/*
	 * Delete course using SQL commands
	 * throws coursenotdeleted Exception
	 */
	
	public void removecoursemain()throws CourseNotDeletedException {
		  PreparedStatement stmt = null;
		  
			
			try{
				   
				 
				   
				    System.out.println("Connecting to database...");
				    conn =DBUtiles.getConnection();
				    //  conn = DriverManager.getConnection(DB_URL,USER,PASS);
				      // Execute a query
				      System.out.println("deleting the course");
				    //  String sql="delete from course where courseid=5";
				      stmt = conn.prepareStatement( SQLQueriesConstants.DELETE_COURSE_QUERY);
				      int course=7;
				      stmt.setInt(1,course);
				      stmt.executeUpdate();
				      stmt.close();
				      conn.close();
			}
			catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
				
	}
	/*
	 * Students approving using SQL commands
	 * throws studentnotapproved Exception
	 */
	public void studregappr() {
		// TODO Auto-generated method stub

		conn=DBUtiles.getConnection();
		PreparedStatement stmts = null;
		
		try{
			  
			      System.out.println("Connecting to database...");
			      
			     
			    Statement  stmt = (Statement) conn.createStatement();
			   
			      ResultSet rs=stmt.executeQuery(SQLQueriesConstants.APPROVE_STUDENT_QUERY);//("select studentid,courseid from student where studentid=1");
			      while(rs.next())
			      {
			    	  System.out.println("studentid="+rs.getInt("studentid"));
			    	  System.out.println("courseid="+rs.getString("courseid"));
			    	  System.out.println("student has been approved to the course");
			      }
			     
			      stmt.close();
			      conn.close();
		}
		catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
			   try{
			         if(stmts!=null)
			            stmts.close();
			      }catch(SQLException se2){
			      }
		      
		   }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
	}
	/*
	 * Add professor using SQL commands
	 * throws professornotadded Exception
	 */
	public void addprofcou() throws ProfessorNotAddedException {

		   conn=DBUtiles.getConnection();			   
		    PreparedStatement stmt = null;
		  
	
		try{
			   
			      System.out.println("Creating statement...");
			   //   String sql="insert into admin values(?,?,?,?,?)";
			      
			      stmt = conn.prepareStatement(SQLQueriesConstants.ADD_PROFESSOR_QUERY);
			      int adminid=12;
			      String adminname="raj";
			      int studentid=3;
			      int profid=2;
			      int courseid=1;
					
			      stmt.setInt(1,adminid);  
			      stmt.setString(2,adminname);
			      stmt.setInt(3,studentid);
			      stmt.setInt(4,profid);
			      stmt.setInt(5,courseid);
			   
			      stmt.executeUpdate();
			      stmt.close();
			      conn.close();
			      
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
		
    }

	
	

}