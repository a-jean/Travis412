package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

    @Test
    public void testSubtract() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.subtract(5, 1), 4);
    }


    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.multiply(5, 4), 20);
    }


    @Test
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.dividebyzero(7, 0), "You cannot divide by zero!");
    }
}
