package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDogConstructor (){
        String name = "Scooby";
        Dog dog = new Dog(name);
        Assert.assertTrue(dog instanceof Dog);
    }

    @Test
    public void testDogSpeak(){
        Dog dog = new Dog("Scooby");
        String expected = "Bark!";
        String actual =  dog.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDogName(){
        Dog dog = new Dog(null);
        dog.setName("ScoobyDoo");
        String actual = dog.getName();
        String expected = "ScoobyDoo";
        Assert.assertEquals(expected,actual);
    }

}