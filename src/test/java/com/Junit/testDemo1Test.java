package com.Junit;

import org.junit.*;

import static org.testng.Assert.assertEquals;

/**
 * created by xiapf on 2017/12/26
 * 为了看看这些注解都是干什么用的
 */
public class testDemo1Test {
    testDemo1 calculation = new testDemo1();
    int sum = calculation.sum(2, 5);
    int testSum = 7;

    @Before
    public void before(){
        System.out.println("before");
    }
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("beforeClass");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @AfterClass
    public  static void afterClass(){
        System.out.println("afterClass");
    }
    @Ignore
    public static void ignore(){
        System.out.println("ignore");
    }
    @Test
    public void testSum() {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum,"这个message相当于备注");
    }

}
