package simpleCarculrator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterWeiedAddTest 
{

	private int expected;
	private int val1;
	private int val2;
	
	
	@Parameters
	public static Collection getParameters(){
		return Arrays.asList(new Object[][] {
			{5, 7, 100},
			{5,100,105},
			{100, 7, 107}
				});
		}
	
	public ParameterWeiedAddTest(int v1, int v2, int e)
	{
		expected=e;
		val1=v1;
		val2=v2;
	}
	
	@Test
	public void weiredAddWithParameters()
	{
		SimpleCarculrator calc=new SimpleCarculrator();
		calc.weiredAdd(val1, val2);
		assertEquals(expected, calc.getResult());
	}
	}



