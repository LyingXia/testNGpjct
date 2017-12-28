package com.Junit;

import org.junit.*;


import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * created by xiapf on 2017/12/28
 * 查看多个测试的时候执行顺序
 */
public class testDemo4 {

    private Collection collection;

    @BeforeClass
    public static void BeforeALL(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void AfterALL(){
        System.out.println("AfterClass");
    }

    @Before
    public  void BeforeTest(){
        collection = new ArrayList();
        System.out.println("Before");
    }

    @After
    public  void AfterTest(){
        System.out.println("After");
    }

    @Test
    public void testOne(){
        assertTrue(collection.isEmpty());
        System.out.println("@Test---First");
    }

    @Test
    public void testTwo(){
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("@Test---Second");
    }
}
