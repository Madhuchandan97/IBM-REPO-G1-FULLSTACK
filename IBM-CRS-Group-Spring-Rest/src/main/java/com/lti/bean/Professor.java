/**
 * 
 */
package com.lti.bean;

/**
 * @author 003NZ1744
 *
 */
public class Professor {
	private int professorid;
	public int getProfessorid() {
		return professorid;
	}
	public void setProfessorid(int professorid) {
		this.professorid = professorid;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private String grades;
	private String course;
}
