package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class PrintTrianglesSpec {
    @Test
    public void testLoop(){
        PrintTriangles first = new PrintTriangles();
        String expectedValue =
        "*** Output ***\n" +
        "*\n" +
        "**\n" +
       "***\n" +
        "****\n" +
        "*****";
        String actualValue = first.Triangle();
        assertEquals("Check output", expectedValue, actualValue);

    }
}
