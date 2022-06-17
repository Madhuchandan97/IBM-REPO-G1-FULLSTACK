package com.crs.ibm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crs.ibm.exception.CourseNotAdded;
import com.crs.ibm.utile.DBUtiles;
import com.mysql.jdbc.Statement;
import com.crs.ibm.exception.*;
public class AdminDaoservice implements AdminDaointerface
{Connection conn = null;
	public void addcoursemain()
	{
		 conn=DBUtiles.getConnection();			   
		    PreparedStatement stmts = null;
		  
	
		try{
			   
			   
			      // Execute a query
			      System.out.println("Creating statement...");
			      String sql="insert into course values(?,?)";
			      
			      stmts = conn.prepareStatement(sql);
			     int courseid=5;
			     String coursename="sas";
			     
					
			      stmts.setInt(1,courseid);  
			      stmts.setString(2,coursename);
			     
			      stmts.executeUpdate();
			      stmts.close();
			      conn.close();
			      
			   }catch(SQLException se){
				   se.getMessage();
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
	
	public void removecoursemain() {
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
				      String sql="delete from course where courseid=5";
				      stmt = conn.prepareStatement(sql);
				      
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
	public void studregappr() {
		// TODO Auto-generated method stub

		conn=DBUtiles.getConnection();
		PreparedStatement stmts = null;
		
		try{
			  
			      System.out.println("Connecting to database...");
			      
			     
			    Statement  stmt = (Statement) conn.createStatement();
			   
			      ResultSet rs=stmt.executeQuery("select studentid,courseid from student where studentid=1");
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
	public void addprofcou() {

		   conn=DBUtiles.getConnection();			   
		    PreparedStatement stmt = null;
		  
	
		try{
			   
			      System.out.println("Creating statement...");
			      String sql="insert into admin values(?,?,?,?,?)";
			      
			      stmt = conn.prepareStatement(sql);
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