package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class OneTenSpec {
    @Test
    public void testLoop(){
        OneTen first = new OneTen();
        String expectedValue = "*** Output ***"+"\n"+"1"+"\n"+"2"+"\n"+"3"+"\n"+"4"+"\n"+"5"+"\n"+"6"+"\n"+"7"+"\n"+"8"+"\n"+"9"+"\n"+"10"+"\n";
        String actualValue = first.createLoop();
        assertEquals("Check output", expectedValue, actualValue);

    }
}
