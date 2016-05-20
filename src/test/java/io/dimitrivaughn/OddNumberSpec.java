package io.dimitrivaughn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class OddNumberSpec {
    @Test
    public void testLoop(){
        OddNumbers first = new OddNumbers();
        String expectedValue = "*** Output ***"+"\n"+"1"+"\n"+"3"+"\n"+"5"+"\n"+"7"+"\n"+"9"+"\n"+"11"+"\n"+"13"+"\n"+"15"+"\n"+"17"+"\n"+"19";
        String actualValue = first.oddLoop();
        assertEquals("Check output", expectedValue, actualValue);

    }
}

