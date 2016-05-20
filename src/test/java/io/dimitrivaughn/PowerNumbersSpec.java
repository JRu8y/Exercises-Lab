package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class PowerNumbersSpec {
    @Test
    public void testLoop(){
        PowerNumbers first = new PowerNumbers();
        String expectedValue = "*** Output ***"+"\n"+"2"+"\n"+"4"+"\n"+"8"+"\n"+"16";
        String actualValue = first.PowerLoop(4);
        assertEquals("Check output", expectedValue, actualValue);

    }
}
