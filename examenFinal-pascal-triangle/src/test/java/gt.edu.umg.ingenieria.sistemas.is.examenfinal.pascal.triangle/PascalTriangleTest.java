package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    private PascalTriangle pascalTriangle=new PascalTriangle();
    public PascalTriangleTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void simpleInput_normalOutput() {
        System.out.println("TEST #1 - whenBasicInput_thenBasicOutput");

        // given
        int input = 5;
        String expectedResult = "[1]\n" +
                "[1, 1]\n" +
                "[1, 2, 1]\n" +
                "[1, 3, 3, 1]\n" +
                "[1, 4, 6, 4, 1]\n";

        // when
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("Test #1 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void negativeInput_emptyOutput() {
        System.out.println("TEST #2 - negativeInput_emptyOutput");

        // given
        int input = -5;
        String expectedResult = Arrays.toString(new long[0]);

        // when
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("Test #2 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void zeroInput_zeroOutput() {
        System.out.println("TEST #3 - zeroInput_zeroOutput");

        // given
        int input = 0;
        String expectedResult = Arrays.toString(new long[]{0});

        // when
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("Test #3 FAILED!!!", actualResult, expectedResult);
    }


    @Test
    public void tooLongInput_negativeOneOutput() {
        System.out.println("TEST #4 - tooLongInput_negativeOneOutput");

        // given
        int input = 5100;
        String expectedResult = Arrays.toString(new long[]{-1});

        // when
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("Test #4 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void maxIntInput_negativeTwoOutput() {
        System.out.println("TEST #5 - maxIntInput_negativeTwoOutput");

        // given
        int input = Integer.MAX_VALUE;
        String expectedResult = Arrays.toString(new long[]{-2});

        // when
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("Test #5 FAILED!!!", actualResult, expectedResult);
    }
}