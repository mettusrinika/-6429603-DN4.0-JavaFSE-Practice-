import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest
{
private Calculator cal;

@BeforeEach
public void setup()
{
cal = new Calculator();
System.out.println("Setup: object created for calculator");
}

@AfterEach
public void tearDown()
{
cal = null;
System.out.println("Teardown: object removed");
}

@Test
public void testAdd()
{
int res = cal.add(2, 3);
assertEquals(5, res);
}

@Test
public void testMul()
{
int res = cal.mul(4, 5);
assertEquals(20, res);
}
}


