package ua.goit;

import org.junit.*;

import static org.junit.Assert.*;


public class CalculatorTest {
    @BeforeClass
    public static void beforeClassTests() {
        System.out.println("Before class start at: " + System.currentTimeMillis());
    }

    @AfterClass
    public static void afterClassTests() {
        System.out.println("After class finish at: " + System.currentTimeMillis());
    }

    @Before
    public void beforeTest() {
        System.out.println("Before start at: " + System.currentTimeMillis());
    }

    @After
    public void afterTest() {
        System.out.println("After finish at: " + System.currentTimeMillis());
    }

    @Test
    public void addTest() {
        System.out.println("addTest");
        //Given
        Calculator calc = new Calculator();
        final int value1 = 1;
        final int value2 = 1;

        //When
        final int result = calc.add(value1, value2);

        //Then
        final int expected = 2;
        assertEquals(expected, result);



    }

    @Test
    public void subTest() {
        System.out.println("subTest");

    }

    @Test
    public void mulTest() {
        System.out.println("mulTest");

    }

    @Test
    public void divTest() {
        System.out.println("divTest");

    }

    @Test
    public void divByZeroTest() {
        System.out.println("divByZeroTest");

    }
}
