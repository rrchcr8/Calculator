import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        assertEquals("5.0",Calculator.calculate("3","2","+"));
        assertEquals("1.0",Calculator.calculate("3","2","-"));
        assertEquals("6.0",Calculator.calculate("3","2","x"));
        assertEquals("2.0",Calculator.calculate("4","2","/"));
            }
}