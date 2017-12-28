package com.Junit;

import org.junit.Test;

/**
 * created by xiapf on 2017/12/28
 * 这个是为了学习预期异常的，其实感觉开发用的多
 * 下面的是超时，如果是超过了就失败
 */
public class testDemo5 {
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }

    @Test(timeout = 1000)
    public void infinity() {
        //下面不会有返回
        while (true);
    }
}
