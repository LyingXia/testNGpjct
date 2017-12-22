package com.testNG;

import org.junit.Assert;
import org.junit.Test;

    /**
        * created by xiapf on 2017/12/21
     * */
public  class testDemo {
    @Test
    public void testcase1(){
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("testcase1");
    }
}

