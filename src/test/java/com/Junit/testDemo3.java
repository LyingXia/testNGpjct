package com.Junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

/**
 * created by xiapf on 2017/12/28
 * rule规则，我感觉就是之前定义一个下面方法用到的规则，然后方法调用
 */
    public class testDemo3 {
    @Rule
    public TestName name = new TestName();

    @Test
    public void testA(){
        System.out.println(name.getMethodName());
        assertEquals("testA", name.getMethodName());
    }
    @Test
    public void testB() {
        System.out.println(name.getMethodName());
        assertEquals("testB", name.getMethodName());
    }
}
