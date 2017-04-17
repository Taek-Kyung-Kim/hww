package simpleCarculrator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SimpleCarculratorTest {
	SimpleCarculrator calc;
	
	@BeforeClass
	public static 
	void setUpClass()
	{
		System.out.println("BeforeClass...");
	}
	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("AfterClass...");
	}
	
	@Before
	public void setUp()
	{
		System.out.println("Before...");
		calc = new SimpleCarculrator();
	}
	@After
	public void tearDown()
	{
		System.out.println("After...");
	}
	
	@Test
	@Category(Rain.class)
	public void addWithPositives() {
		System.out.println("addWithPositives");
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}

	@Test
	@Category(Rain.class)
	public void addWithZeros() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.add(0, 0);
		assertEquals(0, calc.getResult());
	}

	@Test
	@Category(Rain.class)
	public void subWithPositives() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
	}

	@Test
	public void subWithZeros() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.sub(0, 0);
		assertEquals(0, calc.getResult());
	}

	@Test
	public void incWithPositives() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.inc(10);
		assertEquals(10, calc.getResult());
	}

	@Test
	public void incWithZeros() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.inc(0);
		assertEquals(0, calc.getResult());
	}

	@Test
	public void decWithPositives() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.dec(10);
		assertEquals(-10, calc.getResult());
	}

	@Test
	public void decWithZeros() {
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.dec(0);
		assertEquals(0, calc.getResult());
	}

	@Test
	public void divWithPositives() {
		System.out.println("divWithPositives");
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.div(20, 2);
		assertEquals(10, calc.getResult());
	}
	
	@Test(expected=InvalidArgumentException.class)
	public void addWithPositivesArgument()throws Exception{
		System.out.println("addWithPositivesArgument");
		//SimpleCarculrator calc = new SimpleCarculrator();
		calc.addWithPositiveArgs(10, 20);
	}
	

}
