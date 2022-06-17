/**
 * 
 */
package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Admin;

/**
 * @author 003NZ1744
 *
 */
public interface AdminDao {
	/** 
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void create(String studreg, String course);

	public Admin getAdmin(Integer adminid);

	public List<Admin> listAdmins();

	public void delete(Integer adminid);

	public void update(Integer adminid, String course);
}


