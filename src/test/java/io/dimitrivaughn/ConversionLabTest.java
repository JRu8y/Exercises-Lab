package io.dimitrivaughn;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dimitrivaughn on 6/7/16.
 */
public class ConversionLabTest {

    ConversionLab lab;
    String actualValue;
    String expectedValue;
    String[] testArray = {"1","2","3"};

    @Before
    public void initialization(){
        lab = new ConversionLab();
    }

    @Test
    public void convertArrayTest(){
        expectedValue = "onetwothree";
        actualValue = lab.convertArray(testArray);
        Assert.assertEquals("tests whether number conversion occurs", expectedValue, actualValue);
    }

}
