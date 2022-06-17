/**
 * 
 */
package com.crs.ibm.dao;

import java.sql.Connection;


//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.util.InputMismatchException;
import  java.sql.Statement;
//import com.ibm.bean.Student;
import com.crs.ibm.utile.DBUtiles;
/**
 * @author 003NZ1744
 *
 */
public class StudentDaoservice implements StudentDaointerface {
	Connection conn = null;
	Scanner s=new Scanner(System.in);
	
	public void addstudents()
	{
		 conn=DBUtiles.getConnection();			   
		    PreparedStatement stmts = null;
		  
	
		try{
			   
			   
			      // Execute a query
			      System.out.println("Creating statement...");
			      String sql="insert into student values(?,?,?,?,?,?)";
			      
			      stmts = conn.prepareStatement(sql);
			      int studentid=6;
			      String studname="anu";
			      String gender="female";
			      int courseid=3;
			      String grades="A";
			      int fees=30000;
			     
					
			      stmts.setInt(1,studentid);  
			      stmts.setString(2,studname);
			      stmts.setString(3,gender);
			      stmts.setInt(4,courseid);
			      stmts.setString(5,grades);
			      stmts.setInt(6,fees);
			      stmts.executeUpdate();
			      stmts.close();
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
	public void deletecourse(int studentid)
	{
		
		  PreparedStatement stmt = null;
		  
	
		try{
			   
			   // Regiater Driver here and create connection 
			   
			 //  Class.forName("com.mysql.jdbc.Driver");

			   // make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			    conn =DBUtiles.getConnection();
			    //  conn = DriverManager.getConnection(DB_URL,USER,PASS);
			      // Execute a query
			      System.out.println("deleting the course");
			      String sql="delete from student where studentid=?";
			      stmt = conn.prepareStatement(sql);
			      stmt.setInt(1, studentid);
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
	public void viewgrades()
	{ Connection conn = null;
    	PreparedStatement stmts = null;
	   
		  
		
	try{
		   
		   // Regiater Driver here and create connection 
		   
		 // Class.forName("com.mysql.jdbc.Driver");

		   // make/open  a connection 
		   
		      System.out.println("Connecting to database...");
		      conn = DBUtiles.getConnection();
		     
		    Statement  stmt = conn.createStatement();
		   
		      // Execute a query
		      ResultSet rs=stmt.executeQuery("select courseid,grades from student");
		      while(rs.next())
		      {
		    	  System.out.println("courseid="+rs.getInt("courseid"));
		    	  System.out.println("grades="+rs.getString("grades"));
		    	  System.out.println("");
		      }
		     
		      stmt.close();
		      conn.close();
	}
	catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.fgf
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
	public void viewfee()
	{
		Connection conn = null;
		PreparedStatement stmts = null;
		   
			  
			
		try{
			   
			   // Regiater Driver here and create connection 
			   
			 //  Class.forName("com.mysql.jdbc.Driver");

			   // make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn =DBUtiles.getConnection();
			   
			    Statement  stmt = conn.createStatement();
			   
			      // Execute a query
			      ResultSet rs=stmt.executeQuery("select studentid,fees from student where studentid=1");
			      while(rs.next())
			      {
			    	  System.out.println("studentid="+rs.getInt("studentid"));
			    	  System.out.println("fees="+rs.getInt("fees"));
			    	  System.out.println("");
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
	}


