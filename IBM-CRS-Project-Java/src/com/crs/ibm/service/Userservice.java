/**
 * 
 */
package com.crs.ibm.service;

import java.util.Scanner;

/**
 * @author 003NZ1744
 *
 */
public class Userservice implements UserInterface {
	Scanner s=new Scanner(System.in);
	public void portal()
	{
		//here student , professor and admin can login using their id
		
		System.out.println(" enter your id and password to login");
		String a=s.nextLine();
		int k=s.nextInt();
		System.out.println("you have successfully login to the portal");
		/*
		 * char fi=a.charAt(0); if(fi=='S') { return 1; } else if(fi=='P') { return 2; }
		 * else { return 3; }
		 */		
		
	}
	public void newuser()
	{
		// you can get id and password here
		int b=0;
		while(b==0)
		{
		System.out.println("you can create your id and password");
		System.out.println("create your user name");
		String o=s.nextLine();
		System.out.println("enter your new password");
		int l=s.nextInt();
		System.out.println("re-enter your new password");
		int j=s.nextInt();
		if(l==j)
		{
			System.out.println("your id and password is successfully created");
			b=1;
		}
		else
		{
		   System.out.println("your passwords are mismatched");
		   System.out.println("re-enter your id and password");
		   b=0;
		}
		}

}
}
