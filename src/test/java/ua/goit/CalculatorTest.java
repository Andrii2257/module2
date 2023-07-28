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
        //Given
        Calculator calc = new Calculator();
        final int value1 = 2;
        final int value2 = 1;

        //When
        final int result = calc.sub(value1, value2);

        //Then
        final int expected = 1;
        assertEquals(expected, result);


    }

    @Test
    public void mulTest() {
        System.out.println("mulTest");
        //Given
        Calculator calc = new Calculator();
        final int value1 = -5;
        final int value2 = 6;

        //When
        final int result = calc.mul(value1, value2);

        //Then
        final int expected = -30;
        assertEquals(expected, result);
    }

    @Test
    public void divTest() {
        System.out.println("divTest");
        //Given
        Calculator calc = new Calculator();
        final int value1 = 11;
        final int value2 = 5;

        //When
        final int result = calc.div(value1, value2);

        //Then
        final int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void divByZeroTest() {
        System.out.println("divByZeroTest");
    //Given
        Calculator calc = new Calculator();
        final int value1 = 12;
        final int value2 = 0;
        //When
       // final int result = calc.div(value1, value2);

        //Then
        assertThrows(ArithmeticException.class, ()->{calc.div(value1, value2);});

    }
}
