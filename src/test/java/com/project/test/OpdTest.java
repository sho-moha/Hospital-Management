package com.project.test;

import com.project.entity.OpdDetails;

import junit.framework.*;

public class OpdTest extends TestCase {

	OpdDetails opd;
	
	protected void setUp() throws Exception {
		super.setUp();
		opd = new OpdDetails("symptoms", "diagnosis", "medicinesDose","dos", "donts",
				"investigations", "followupDate", 1200);	
	}
	
	public void testGetSymptoms() {
		String expected = "symptoms";
		assertEquals(null,expected,opd.getSymptoms());
	}
	
	public void testGetdiag() {
		assertNotNull(null,opd.getDiagnosis());
	}
	
	public void testGetMdose() {
		String expected = "medicinesDose";
		assertEquals(null,expected,opd.getMedicinesDose());
	}
	
	public void testGetdos() {
		assertNotNull(null,opd.getDos());
	}
	
	public void testGetDont() {
		String expected = "donts";
		assertEquals(null,expected,opd.getDonts());
	}
	
	public void testGetQuali() {
		String expected = "investigations";
		assertEquals(null,expected,opd.getInvestigations());
	}
	
	public void testGetSpeci() {
		int expected = 1200;
		assertEquals(null,expected,opd.getFees());
	}
	
	
}
