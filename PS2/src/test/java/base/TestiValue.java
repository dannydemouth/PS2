package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestiValue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testiValue() {
		MyInteger myint = new MyInteger(10);
		boolean ExpectedEven = true;
		boolean ExpectedOdd = false;
		boolean ExpectedPrime = false;
		
		assertEquals(myint.isEven(),ExpectedEven);
		assertEquals(myint.isOdd(),ExpectedOdd);
		assertEquals(myint.isPrime(),ExpectedPrime);
		
		boolean ExpectedEven1 = false;
		boolean ExpectedOdd1 = true;
		boolean ExpectedPrime1 = true;
		
		assertEquals(myint.isEven(11),ExpectedEven1);
		assertEquals(myint.isOdd(11),ExpectedOdd1);
		assertEquals(myint.isPrime(11),ExpectedPrime1);
		
		boolean Expectedequals = true;
		assertEquals(myint.equals(5),Expectedequals);
	}
	

}
