package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class SquareNumberSpec {
        @Test
        public void testLoop(){
            SquareNumbers first = new SquareNumbers();
            String expectedValue = "*** Output ***"+"\n"+"1"+"\n"+"4"+"\n"+"9"+"\n"+"16"+"\n"+"25"+"\n"+"36"+"\n"+"49"+"\n"+"64"+"\n"+"81"+"\n"+"100";
            String actualValue = first.squareLoop();
            assertEquals("Check output", expectedValue, actualValue);

        }
}
