package com.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * created by xiapf on 2018/1/2
 */
@RunWith(value = Parameterized.class)
public class HelloTest {
    private String message;
    Hello h = new Hello();
    @Before
    public void before(){
        message = h.Hello();
    }
    /*@Test
    public void HelloTest(){
        assertEquals("Hello World",message);
    }*/
    @After
    public void after(){
        message = h.Hello();
    }
   /* @Test
    public void HelloTest1(){
        assertNotEquals("Hello World",message);
    }*/
    @Parameters(name = "TEST{index} :{0} ^^  Hello World")
    public static List heloo(){
        return Arrays.asList(new String[]{
            "hello world",
            "HelloWorld",
            "Hello World"
        });
    }
    private String s;
    public HelloTest(String s){
        this.s= s;
    }
    @Test
    public void HelloTest(){
        assertEquals(s,message);
    }
}