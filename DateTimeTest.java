package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		String testString = "1994-03-09 11:00"; 
		DateTime mariasBirthday = new DateTime(1994,3,9,11,0,0); 
	 
		assertEquals("Fail, not equals", testString, mariasBirthday.toString()); 

	}

	@Test
	public void testDateTimeString() {
		String testString = "1994-03-09 11:00";   
		DateTime mariasBirthday = new DateTime(testString); 
		
		assertEquals("Fail, not equals", testString, mariasBirthday.toString()); 

	}

}
