import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingsLoopsTest
{

    @Test
    void numOfMinutes()
    {
        UnitTestingsLoops first = new UnitTestingsLoops(1,2,22);
        assertEquals(22, first.numOfMinutes());
    }
}