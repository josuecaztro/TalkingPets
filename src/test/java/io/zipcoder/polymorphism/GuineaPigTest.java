package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuineaPigTest {

    @Test
    public void testGuineaConstructor (){
        String name = "Piggy";
        GuineaPig guineaPig = new GuineaPig(name);
        Assert.assertTrue(guineaPig instanceof GuineaPig);
    }

    @Test
    public void testGuineaSpeak(){
        GuineaPig guineaPig = new GuineaPig(null);
        String expected = "Squeak!";
        String actual = guineaPig.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGuineaName(){
        GuineaPig guineaPig = new GuineaPig(null);
        guineaPig.setName("PigPig");
        String actual = guineaPig.getName();
        String expected = "PigPig";
        Assert.assertEquals(expected,actual);
    }


}