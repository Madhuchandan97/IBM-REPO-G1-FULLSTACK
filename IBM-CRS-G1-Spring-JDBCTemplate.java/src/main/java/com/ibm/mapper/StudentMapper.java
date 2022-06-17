/**
 * 
 */
package com.ibm.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ibm.bean.Student;
/**
 * @author 003NZ1744
 *
 */
 
public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setName(rs.getString("name"));
		student.setBatch(rs.getString("batch"));
		student.setCourse(rs.getString("course"));
		student.setStudid(rs.getInt("Studid"));
	      return student;
}
}