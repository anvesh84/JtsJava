package com.dxc.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		assertEquals(1, employ.getEmpno());
		employ.setName("Prashanth");
		assertEquals("Prashanth", employ.getName());
		employ.setDept("Java");
		assertEquals("Java", employ.getDept());
		employ.setDesig("Programmer");
		assertEquals("Programmer", employ.getDesig());
		employ.setBasic(12000);
		assertEquals(12000, employ.getBasic());
	}
	
	@Test
	public void testConstructor() {
		Employ employ = new Employ(1, "Anvesh", "Java", "Programmer", 55322);
		assertEquals(1, employ.getEmpno());
		assertEquals("Anvesh", employ.getName());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(55322, employ.getBasic());
	}
}
