package com.ictacademy.student;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentTest {

	@Test
	public void test() {
		Assignment obj1=new Assignment();
		assertEquals(obj1.si(1000,2,5),10000);
		//fail("Not yet implemented");
	}

}
