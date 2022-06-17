/**
 * 
 */
package com.crs.ibm.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.crs.ibm.dao.AdminDaointerface;
import com.crs.ibm.dao.AdminDaoservice;

/**
 * @author 003NZ1744
 *
 */
public class AdminService implements AdminInterface{
	AdminDaointerface ad=new AdminDaoservice();
	Scanner s=new Scanner(System.in);
	List a=new ArrayList();
	public void genreportcard()
	{
		// here admin can gnerate the report card for students
		System.out.println("here admin can generate the report card for students");
		System.out.println("enter student id for generating the report card");
		int k=s.nextInt();
		System.out.println("giridhar reddy");
		System.out.println("cse");
		System.out.println("java   A");
		System.out.println("c      B");
		System.out.println("opps   A");
		System.out.println("pythan  B");
		
	}
	public void addprof()
	{ad.addprofcou();
		// here admin can add the professor to the particular courses
		/*
		 * System.out.
		 * println("here admin can add the professor to the particular courses");
		 * System.out.println("enter the professor id"); int e=s.nextInt();
		 * System.out.println("1: add professor to java");
		 * System.out.println("2: add professor to c");
		 * System.out.println("3: add professor to opps");
		 * System.out.println("4: add professor to pythan"); int h=s.nextInt();
		 * switch(h) { case 1:
		 * System.out.println("successfuly professor is added to java course"); break;
		 * case 2: System.out.println("successfuly professor is added to c course");
		 * break; case 3:
		 * System.out.println("successfuly professor is added to opps course"); break;
		 * case 4:
		 * System.out.println("successfuly professor is added to pythan course"); break;
		 * default: System.out.println("select a valid course"); break; }
		 */	}
	public void studreg()
	{ad.studregappr();
		// here admin can approve the student registration for courses
		/*
		 * System.out.
		 * println("here admin can approve the student registration for courses");
		 * System.out.
		 * println("enter the student id for approving the student registration for the course"
		 * ); int f=s.nextInt(); System.out.println("1:For approveing the course");
		 * System.out.println("2:not approveing the course"); int l=s.nextInt();
		 * if(l==1) { System.out.println("giridhar reddy"); System.out.println("cse");
		 * System.out.println("java"); System.out.println("9182704101");
		 * System.out.println("successfuly aproved for the course"); } else {
		 * System.out.println("giridhar reddy"); System.out.println("cse");
		 * System.out.println("java"); System.out.println("9182704101");
		 * System.out.println("not aproved for the course"); }
		 */
	}
	public void courseadd()
	{
		ad.addcoursemain();
	}
	public void courserem() 
	{
		ad.removecoursemain();
	}

}
