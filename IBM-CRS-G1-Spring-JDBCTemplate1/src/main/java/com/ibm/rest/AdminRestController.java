/**
 * 
 */
package com.ibm.rest;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Admin;

import com.ibm.dao.AdminDaoImpl;

/**
 * @author 003NZ1744
 *
 */
@RestController
@CrossOrigin
public class AdminRestController {

	@Autowired
	AdminDaoImpl admindao;
	
	
	@GetMapping(path="adminlist")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity viewAdmin() {
		List<Admin> admin=admindao.listAdmins();
		if(admin==null) {
			return new ResponseEntity<String>("There are no students enrolled.",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity(admin,HttpStatus.OK);
	}
}
