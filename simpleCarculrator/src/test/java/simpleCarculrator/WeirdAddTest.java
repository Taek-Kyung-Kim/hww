package simpleCarculrator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class WeirdAddTest {

	@Test
	@Category(Rain.class)
	public void wierdAddWithFiveandSeven()
	{
		SimpleCarculrator calc =new SimpleCarculrator();
		calc.weiredAdd(5,7);
		assertEquals(100, calc.getResult());
	}
	@Test
	public void wierdAddWithFive()
	{
		SimpleCarculrator calc =new SimpleCarculrator();
		calc.weiredAdd(5,100);
		assertEquals(105, calc.getResult());
	}
	@Test
	public void wierdAddWithSeven()
	{
		SimpleCarculrator calc =new SimpleCarculrator();
		calc.weiredAdd(100,7);
		assertEquals(107, calc.getResult());
	}


}
