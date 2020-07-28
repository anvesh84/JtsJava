package com.dxc.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testProperty() {
		Data obj = new Data();
		assertNotNull(obj.getPropertyTest("Sai"));
		assertNull(obj.getPropertyTest("Prashanth"));
	}
	@Test
	public void testEven() {
		Data obj = new Data();
		assertTrue(obj.check(6));
		assertFalse(obj.check(5));
	}
	
	@Test
	public void testMax3() {
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(2, 3, 5));
	}
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit Programming...", obj.sayHello());
	}

	@Test
	public void testSum() {
		Data obj = new Data();
		assertEquals(5, obj.sum(2, 3));
	}
}
