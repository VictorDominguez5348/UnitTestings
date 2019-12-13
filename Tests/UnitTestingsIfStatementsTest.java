import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingsIfStatementsTest
{

    @Test
    void num1LessThan1()
    {

        UnitTestingsIfStatements first = new UnitTestingsIfStatements(1,4,3);
        assertEquals(true, first.num1LessThan());
    }
    @Test
    void num1LessThan2()
    {

        UnitTestingsIfStatements second = new UnitTestingsIfStatements(-1,42,0);
        assertEquals(true, second.num1LessThan());
    }

    @Test
    void sumGreaterThanTen1()
    {

        UnitTestingsIfStatements first = new UnitTestingsIfStatements(-1,42,0);
        assertEquals(true, first.sumGreaterThanTen());
    }

    @Test
    void sumGreaterThanTen2()
    {

        UnitTestingsIfStatements second = new UnitTestingsIfStatements(-1,10,0);
        assertEquals(false, second.sumGreaterThanTen());
    }

    @Test
    void minFinder1()
    {
        UnitTestingsIfStatements first = new UnitTestingsIfStatements(2,1,-1);
        assertEquals(-1, first.minFinder());
    }

    @Test
    void minFinder2()
    {
        UnitTestingsIfStatements second = new UnitTestingsIfStatements(0,2,123);
        assertEquals(0, second.minFinder());
    }
    @Test
    void minFinder3()
    {
        UnitTestingsIfStatements second = new UnitTestingsIfStatements(10,1,123);
        assertEquals(1, second.minFinder());
    }

    @Test
    void HelloWorld1()
    {
        UnitTestingsIfStatements first = new UnitTestingsIfStatements("Hello ", "World");
        assertEquals("Hello World", first.messageSender());
    }

    @Test
    void HelloWorld2()
    {
        UnitTestingsIfStatements second = new UnitTestingsIfStatements("12 ", "34");
        assertEquals("12 34", second.messageSender());
    }
}