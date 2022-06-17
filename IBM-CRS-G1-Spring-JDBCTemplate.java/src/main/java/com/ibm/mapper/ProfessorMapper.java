/**
 * 
 */
package com.ibm.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ibm.bean.Professor;
/**
 * @author 003NZ1744
 *
 */
 
public class ProfessorMapper implements RowMapper<Professor> {

	@Override
	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Professor professor = new Professor();
		professor.setCourse(rs.getString("course"));
		professor.setProfessorid(rs.getInt("professoroid"));
		professor.setGrades(rs.getString("grades"));
	      return professor;
}
}