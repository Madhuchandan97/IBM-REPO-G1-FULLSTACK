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

import com.ibm.bean.Student;
import com.ibm.dao.StudentDaoImpl;

/**
 * @author 003NZ1744
 *
 */
@RestController
@CrossOrigin
public class StudentRestController {

	@Autowired
	StudentDaoImpl studentdao;
	
	
	@GetMapping(path="studentlist")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity viewStudent() {
		List<Student> student=studentdao.listStudents();
		if(student==null) {
			return new ResponseEntity<String>("There are no students enrolled.",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity(student,HttpStatus.OK);
	}
}
