/**
 * 
 */
package com.lti.bean;

/**
 * @author 003NZ1744
 *
 */
public class User {
	private int studentid;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getProfessorid() {
		return professorid;
	}
	public void setProfessorid(int professorid) {
		this.professorid = professorid;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	private int professorid;
	private int adminid;
}
