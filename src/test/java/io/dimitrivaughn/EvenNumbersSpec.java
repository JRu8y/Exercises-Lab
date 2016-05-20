package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class EvenNumbersSpec {
    @Test
    public void testLoop(){
        EvenNumbers first = new EvenNumbers();
        String expectedValue = "*** Output ***"+"\n"+"2"+"\n"+"4"+"\n"+"6"+"\n"+"8";
        String actualValue = first.EvenLoop(10);
        assertEquals("Check output", expectedValue, actualValue);

    }
}
