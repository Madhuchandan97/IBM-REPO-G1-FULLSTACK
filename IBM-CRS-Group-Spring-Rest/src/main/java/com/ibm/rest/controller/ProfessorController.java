/**
 * 
 */
package com.ibm.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.lti.bean.Student;
import com.lti.dao.ProfessorDaoservice;

/**
 * @author 003NZ1744
 *
 */
@RestController
@CrossOrigin
public class ProfessorController {
	@Autowired
	private ProfessorDaoservice professorDaoservice;
	@JsonPropertyOrder(value= {"student"})
	//@GetMapping("/professor/student")
	//@Produces(MediaType.APPLICATION_JSON)
	public List<Student>getEnrolledStudent(){
		try {
			return professorDaoservice.getenrolledstudent();
		}catch (NotFound e) {
			e.printStackTrace();
		}
		return getEnrolledStudent();
	}

	@RequestMapping(value="/professor/student/(sid)/{gd}")
	public String adgrades(@PathVariable int sid,@PathVariable String gd) {
		try {
			System.out.println(sid);
			System.out.println(gd);
			professorDaoservice.adgrades();
		}catch(NotFound e) {
			e.printStackTrace();
		}return adgrades(sid, gd);
	}
}
