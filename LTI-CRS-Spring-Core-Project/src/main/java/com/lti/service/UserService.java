/**
 * 
 */
package com.lti.service;

import java.util.Scanner;

import com.lti.dao.UserDaointerface;
import com.lti.dao.UserDaoservice;
import com.lti.service.UserInterface;

/**
 * @author 003N75744
 *
 */
public class UserService implements UserInterface{
	UserDaointerface ud=new UserDaoservice();
	Scanner s=new Scanner(System.in);
	/*
	 * user can login here
	 * throw id and password are wrong
	 */
	public void portal()
	{
		//here student , professor and admin can login using their id
	
		int k;
		System.out.println("Enter the mailid:");
		String a=s.nextLine();
		System.out.println("Enter password");
        k=s.nextInt();
		int l=ud. userlogin(a,k);
		if(l==1)
		{
			System.out.println("id and password is wrong");
		}else {
			System.out.println("succesfully login");
			
		//System.out.println("you have successfully login to the portal");
		}	
		//id and password is wrong
	}
	/*
	 * Here you can create your id and password
	 * And wait for admin approvel
	 */
	public void newuser()
	{ud.newuserlogin();
		
}
}
