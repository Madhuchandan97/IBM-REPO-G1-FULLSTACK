/**
 * 
 */
package com.ibm.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ibm.bean.Admin;
/**
 * @author 003NZ1744
 *
 */
 
public class AdminMapper implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		  Admin admin = new Admin();
		  admin.setStudreg(rs.getString("studreg"));
		  admin.setCourse(rs.getString("course"));
		  admin.setAdminid(rs.getInt("adminid"));
	      return admin;
}
}