import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestPrimceFactors {

	private List<Integer> expectedResult;
	private int input;
	
	public TestPrimceFactors(List<Integer> expectedResult, int input) {
		this.expectedResult = expectedResult;
		this.input = input;
	}
	
	@Parameters
	public static Collection<Object[]> init()
	{
		Object[][] data = new Object[][]{
				{Arrays.asList(), 0},
				{Arrays.asList(), 1},
				{Arrays.asList(2), 2},
				{Arrays.asList(3), 3},
				{Arrays.asList(2,2), 4},
				{Arrays.asList(2,3), 6},
				{Arrays.asList(2,2,2), 8},
				{Arrays.asList(3,3), 9},
				{Arrays.asList(2,2,2,3,13), 312},
				{Arrays.asList(3,4283), 12849},
				{Arrays.asList(2,2,2,2,3,31,593), 882384},
				{Arrays.asList(3,3,7,11,31,151,331), Integer.MAX_VALUE/2},
				{Arrays.asList(9999991), 9999991},
				{Arrays.asList(1531, 1000003), 1000003 * 1531},
				{Arrays.asList(Integer.MAX_VALUE), Integer.MAX_VALUE},
				
				
		};
		
		return Arrays.asList(data);
	}
	
	@Test
	public void testPostiveNumbers()
	{
		PrimeFactors pf = new PrimeFactors();
		Assert.assertEquals(expectedResult, pf.find(input));
	}
}

