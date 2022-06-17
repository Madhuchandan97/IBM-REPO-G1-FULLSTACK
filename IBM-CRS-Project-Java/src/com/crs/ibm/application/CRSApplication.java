/**
 * 
 */
package com.crs.ibm.application;

import java.util.Scanner;

import com.crs.ibm.service.AdminInterface;
import com.crs.ibm.service.AdminService;
import com.crs.ibm.service.ProfessorInterface;
import com.crs.ibm.service.ProfessorService;
import com.crs.ibm.service.StudentInterface;
import com.crs.ibm.service.StudentService;
import com.crs.ibm.service.UserInterface;
import com.crs.ibm.service.Userservice;

/**
 * @author 003NZ1744
 *
 */
public class CRSApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * AdminService a=new AdminService(); ProfessorService p=new ProfessorService();
		 * StudentService s=new StudentService(); Userservice u=new Userservice();
		 */
		UserInterface u=new Userservice();
		AdminInterface a=new AdminService();
		ProfessorInterface p=new ProfessorService();
		StudentInterface s=new StudentService();
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to crsapplication");
		System.out.println("1: login  ");
		System.out.println("2: new registration");
		System.out.println("3: exit");
		int l=sc.nextInt();
		
	   switch(l)
	   {
	   case 1: //here student , professor and admin can login using their id
		   u.portal();
		  // u.newuser();
		   break;
	   case 2:// you can get id and password here
		   u.newuser();
		 //  u.portal();
	   a.studreg();
		   break;
	   default:
		   System.out.println("you are exit from CRSapplication ");
		   System.exit(l);
		   break;
	   }
	   
		System.out.println("choose the profession");
		System.out.println("1: student");
		System.out.println("2: professor");
		System.out.println("3: admin");
		//int ou;
		//ou=v;
		int ou=sc.nextInt();
		switch(ou) 
		{
		case 1:
		       int k=0;
		       while(k==0)
		       {
		    	   System.out.println("student portal");			   
			       System.out.println("choose the reqired details");
			       System.out.println("4: course registration");
			       System.out.println("5: adding the course");
			       System.out.println("6:droping the course");
			       System.out.println("7: view the grades of your course");
	               System.out.println("8: checking the fee details");
			       int f=sc.nextInt();
		       switch(f)
		       {
		       case 4: // student can register for course  
		    	   s.coursereg();
		       break;
		       case 5: // student can add the course 
		    	   s.addcourse();
		       break;
		       case 6:// student can drop the course 
		    	   s.dropcouse(1);
		       break;
		       case 7: // student can  view the grades
		    	   s.grades();
		       break;
		       case 8://student can view the fee details for payment
		    	   s.fee();
		       break;
		       default:
			   System.out.println("choose the valid section");
			   break;
		       }
		       System.out.println("0: to change anything in students");
		       k=sc.nextInt();
		       }
		   break;
		case 2:int i=0;
		       while(i==0)
		       {
			   System.out.println(" professor menu");		
			   System.out.println("choose the required details");
		       System.out.println(" 9: adding grades for students ");
		       System.out.println(" 10: student enrollment");
		       int g=sc.nextInt();
		       switch(g)
		       {
		       case 9:// Here proffesor can add a grade to the student
		    	   p.addgrades();
		       break;
		       case 10:// Here professor can check the student enrollment of course
		    	   p.studentenroll();
		       break;
		       default:
		    	   System.out.println(" choose the valid selection");
		    	   break;
		       }
		       System.out.println("0:to add the course");
		       i=sc.nextInt();
		       }
		       break;
		    
		 case 3:int c=0;
		        while(c==0)
		        {
			    System.out.println("admin menu");		
			    System.out.println("choose the require details");
                System.out.println("12: creating the report card for student");
                System.out.println("13: adding professor course and details");
                System.out.println("14: approving student registration");
                System.out.println("15: adding course in college portal");
                System.out.println("16:removing the courses in the portal");
                int h=sc.nextInt();
                switch(h)
                {
                case 12:// here admin can gnerate the report card for students
                	a.genreportcard();
                break;
                case 13:// here admin can add the professor to the particular courses
                	a.addprof();
                break;
                case 14:// here admin can approve the student registration for courses
                	a.studreg();
                break;
                case 15://here admin can add the new courses in college portal
                	a.courseadd();
                break;
                case 16://here admin can remove the courses in college portal
                	a.courserem();
                break;
                default:
                	System.out.println("enter valid selection");
                    break;
                }
                System.out.println("0:to make changes in admin");
                c=sc.nextInt();
		        }
		        break;
		}
		
    
     
     
	}

}
