package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class RandomNumberSpec {
    @Test
    public void testLoop(){
        RandomNumbers first = new RandomNumbers();
        String expectedValue = "*** Output ***"+"1\n"+"4\n"+ "5\n"+"2\n" +"2\n";;
        String actualValue = first.randomLoop();
        assertEquals("Check output", expectedValue, actualValue);

    }
}
