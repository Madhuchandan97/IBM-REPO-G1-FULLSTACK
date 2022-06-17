/**
 * 
 */
package com.crs.ibm.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.crs.ibm.dao.ProfessorDaointerface;
import com.crs.ibm.dao.ProfessorDaoservice;

/**
 * @author 003NZ1744
 *
 */
public class ProfessorService implements ProfessorInterface {
	ProfessorDaointerface pd=new ProfessorDaoservice();
	Scanner s=new Scanner(System.in);
	List a=new ArrayList();
	List c=new ArrayList();
	public void addgrades()
	{pd.adgrades();
		
		
	}
	public void studentenroll()
	{
		// Here professor can check the student details of course

     pd.getenrolledstudent();
	}
	

}
