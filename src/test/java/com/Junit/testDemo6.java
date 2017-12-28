package com.Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


/**
 * created by xiapf on 2017/12/28
 * Parameterized.Parameters详细的学习
 */
@RunWith(value=Parameterized.class)
public class testDemo6 {
    public static int add(int a, int b) {
        return a + b;
    }

    private int A;
    private int B;
    private int C;

    public testDemo6(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Parameters(name = "{index}: add({0}+{1})={2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 2 },
                { 2, 2, 4 },
                { 8, 2, 10 },
                { 4, 5, 9 }
        });
    }

    @Test
    public void test_add() {
        assertEquals(C,testDemo6.add(A, B));
    }


}
