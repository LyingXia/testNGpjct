package com.Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.Assert.assertEquals;

/**
 * created by xiapf on 2017/12/27
 * 为了使用junit中的创建参数化测试
 */

@RunWith(Parameterized.class)
public class testDemo2 {
    private int expected;
    private int first;
    private int second;

    public testDemo2(int expectedResult, int firstNumber, int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
                { 7, 3, 4 }, { 9, 4, 5 }, });
    }

    @Test
    public void sum() {
        testDemo1 add = new testDemo1();
        System.out.println("Addition with parameters : " + first + " and "
                + second);
        assertEquals(expected, add.sum(first, second));
    }
}
