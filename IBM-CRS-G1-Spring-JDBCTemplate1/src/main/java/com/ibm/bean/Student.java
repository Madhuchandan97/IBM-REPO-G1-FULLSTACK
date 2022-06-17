
	package com.ibm.bean;

	/**
	 * @author 003NZ1744
	 *
	 */
	public class Student {
		private int studid;
		private String name;
		private String course;
		private String batch;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		
		public int getStudid() {
			return studid;
		}
		public void setStudid(int studid) {
			this.studid = studid;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
		
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + ",batch=" + batch + ",course=" + course + ", studid=" + studid + "]";
		}	

	}

