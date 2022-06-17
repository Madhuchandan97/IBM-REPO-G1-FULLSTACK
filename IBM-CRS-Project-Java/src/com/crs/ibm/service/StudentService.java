package com.crs.ibm.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.crs.ibm.dao.StudentDaointerface;
import com.crs.ibm.dao.StudentDaoservice;

public class StudentService  implements StudentInterface{
	StudentDaointerface sd=new StudentDaoservice();
	
	 Scanner s=new Scanner(System.in);
	 List<String> a= new ArrayList<String>();
	// String cou[]=new String[5];
	
 public void coursereg()
 {
	 sd.addstudents();
		
 }
 public void addcourse()
 {
	 // student can add the course
	 System.out.println("student can add the course");
	 System.out.println("enter the course names to add");
	 for(int i=0;i<5;i++)
	 {
		 a.add(s.nextLine());
	 }
		/*
		 * for(int i=0;i<cou.length;i++) { cou[i]=s.nextLine()///; }
		 */
	 System.out.println("the course you are added ");
	 System.out.println(" ");
		 System.out.println(a);
	 
		/*
		 * for(int i=0;i<cou.length;i++) { System.out.println(cou[i]); }
		 */
 }
 public void dropcouse(int id)
 {sd.deletecourse(id);
	
	 
 }
 public void grades()
 {
	 // student can  view the grades
	 System.out.println("student can  view the grades");
	 sd.viewgrades();
		
 }
 public void fee()
 {
	 //student can view the fee details for payment
	 System.out.println("student can view the fee details for payment");
	// System.out.println(" total fee is 30000");
	 sd.viewfee();
 }
}
