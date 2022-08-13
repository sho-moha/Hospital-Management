package com.project.test;

import java.util.Date;

import com.project.entity.Address;
import com.project.entity.Name;
import com.project.entity.Employee;

import junit.framework.*;

public class EmployeeTest extends TestCase {

	Name name = new Name("firstName", "middleName", "lastName");
	Address addr = new Address("residentialAddress", "permanentAddress");
	Date joiningdate= new Date();
	Employee e1;
	
	protected void setUp() throws Exception {
		super.setUp();
		e1 = new Employee(joiningdate, name, "birthdate", "gender", "emailID", 98624536,
				56267238, "country", "state", "city", addr, "role", "qualification",
				"specialization");	
	}
	
	public void testGetCountry() {
		String expected = "country";
		assertEquals(null,expected,e1.getCountry());
	}
	
	public void testGetAddress() {
		assertNotNull(null,e1.getAddress());
	}
	
	public void testGetCity() {
		String expected = "city";
		assertEquals(null,expected,e1.getCity());
	}
	
	public void testGetName() {
		assertNotNull(null,e1.getName());
	}
	
	public void testGetRole() {
		String expected = "role";
		assertEquals(null,expected,e1.getRole());
	}
	
	public void testGetQuali() {
		String expected = "qualification";
		assertEquals(null,expected,e1.getQualification());
	}
	
	public void testGetSpeci() {
		String expected = "specialization";
		assertEquals(null,expected,e1.getSpecialization());
	}
	
	
}
