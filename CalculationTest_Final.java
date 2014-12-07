import static org.junit.Assert.*;

import org.junit.Test;


public class CalculationTest {

	@Test
	public void test() {
		Calculation test =new Calculation();
		String output= test.get_deflection( 148, 243, "120");
		assertEquals("left", output);
	}

}
