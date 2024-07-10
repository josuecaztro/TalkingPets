package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testCatConstructor (){
        String name = "Kitty";
        Cat cat = new Cat(name);
        Assert.assertTrue(cat instanceof Cat);
    }

    @Test
    public void testCatSpeak(){
        Cat cat = new Cat(null);
        String expected = "Meow!";
        String actual =  cat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCatName(){
        Cat cat = new Cat(null);
        cat.setName("Kitty");
        String actual = cat.getName();
        String expected = "Kitty";
        Assert.assertEquals(expected,actual);
    }

}