/**
 * 
 */
package com.crs.ibm.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crs.ibm.utile.DBUtiles;
import com.mysql.jdbc.Connection;

/**
 * @author 003NZ1744
 *
 */
public class ProfessorDaoservice implements ProfessorDaointerface{
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
//	static final String DB_URL = "jdbc:mysql://localhost/test";
	  
	  // Database credentials 
	// static final String USER = "root"; 
	 // static final String PASS = "root";
	  Connection conn =null;
	  public void adgrades()
	  {
		  conn = (Connection) DBUtiles.getConnection();

		   PreparedStatement stmt = null;
		  
	
		try{
			   
			
			   
			      System.out.println("Connecting to database...");
			    // conn = DBUtiles.getConnection();
			 // conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
			      // Execute a query
			      System.out.println("Creating statement...");
			      String sql="insert into professor values(?,?,?,?,?)";
			      //String sql = "UPDATE Employees set age=? WHERE id=?";
			     // String sql1="delete from employee where id=?";
			     // stmt.setInt(1, 101);
			      stmt = conn.prepareStatement(sql);
			      int profid=2;
			      String profname="ashok";
			      int studentid=1;
			      String addgrades="B";
			      int courseid=1;
			      
					
			      stmt.setInt(1, profid);  // This would set age
			      stmt.setString(2,profname);
			      stmt.setInt(3,studentid);
			      stmt.setString(4, addgrades);
			      stmt.setInt(5, courseid);
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
	  public void getenrolledstudent()
	  {
		  conn=(Connection) DBUtiles.getConnection();	
		   
		   PreparedStatement stmt = null;
		   ResultSet rs=null; 
		   try{
			   
			   
			   
			      System.out.println("Creating statement...");
			      String sql="Select * from student where studentid=1"; 
			      stmt = conn.prepareStatement(sql);
			      rs=stmt.executeQuery();
			      System.out.println("");
//			      System.out.println("Student Id:"+id  +"Name:"+name +"Qualification:"+qualification +"Branch:"+branch +"Contact:" +contact +"Address:" +address +"Grade:"+grade);
			       while(rs.next())
			       {
			    	   int studentid=rs.getInt("studentid");
			    	   String studname = rs.getString("studname");
			    	   String gendar=rs.getString("gendar");
			    	   int courseid=rs.getInt("courseid");
                       String grades= rs.getString("grades");
                       int fees=rs.getInt("fees");
                      System.out.println("");
        		       System.out.println("Student Id:"+studentid  +"\tName:"+studname +"\tgendar:"+gendar +"\tcourseid:"+courseid +"\tgrades:"+grades +"\tfees:"+fees);
			        //   System.out.println(id + "\t\t" +name +"\t\t"+qualification +"\t\t"+branch + "\t\t"+contact + "\t\t"+address + "\t\t" +grade);
			       }
			   
			 
			 
			      //STEP 6: Clean-up environment
			      rs.close();
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
			   System.out.println("Goodbye!"); 
	  }
}
