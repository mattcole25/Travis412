package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(2, 0), 2);

	}

	public void testSub(){
		SimpleCalculator calc2 = new SimpleCalculator();
		assertEquals(calc.sub(a:5, b: 2 ), actual: 3);
	}
}
