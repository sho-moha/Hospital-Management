package com.project.test;

import com.project.entity.Address;
import com.project.entity.Name;
import com.project.entity.Patient;

import junit.framework.*;

public class PatientTest extends TestCase {

	Name name = new Name("firstName", "middleName", "lastName");
	Address addr = new Address("residentialAddress", "permanentAddress");
	Patient p1;
	
	protected void setUp() throws Exception {
		super.setUp();
		p1 = new Patient(name, "birthdate", "male", "emailID", 1234567456,
				90898489, "country", "state", "city", addr, "O+",
				 "chronicDiseases", "pollenAllergy", "doctorId");	
	}
	
	public void testGetDid() {
		String expected = "doctorId";
		assertEquals(null,expected,p1.getDoctorId());
	}
	
	public void testGetAddress() {
		assertNotNull(null,p1.getAddress());
	}
	
	public void testGetBG() {
		String expected = "O+";
		assertEquals(null,expected,p1.getBloodGroup());
	}
	
	public void testGetName() {
		assertNotNull(null,p1.getName());
	}
	
	public void testGetBD() {
		String expected = "birthdate";
		assertEquals(null,expected,p1.getBirthdate());
	}
	
	public void testGetGD() {
		String expected = "male";
		assertEquals(null,expected,p1.getGender());
	}
	
	public void testGetMA() {
		String expected = "pollenAllergy";
		assertEquals(null,expected,p1.getMedicineAllergy());
	}
	
	
}
