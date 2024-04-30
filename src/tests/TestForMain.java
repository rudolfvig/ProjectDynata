package tests;

import org.junit.Test;
import project.Main;

import static org.junit.Assert.assertEquals;

public class TestForMain {

    @Test
    public void testAddTwoNumber(){
        int result1 = Main.addTwoNumber(1,2);
        int expected1 = 3;
        int result2 = Main.addTwoNumber(0,0);
        int expected2 = 0;
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }

}
