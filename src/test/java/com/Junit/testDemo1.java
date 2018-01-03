package com.Junit;

/**
 * created by xiapf on 2017/12/26
 * 1、使用@RunWith注解为测试类指定Runner；
 2、Suit一次执行多个类中的测试用例；
 3、Parameterized为测试方法指定多组待测试参数；
 4、使用@Category为测试类中的测试方法分类执行；
 5、Theories结合@DataPoint和@DataPoints提供一组参数的排列组合作为待测试方法的输入参数；
 6、Rule 为单元测试指定测试规则，Assume 对待测试方法的输入参数进行合法性校验，Assert 对测试方法的结果进行校验。
 */
public class testDemo1 {
    public int sum(int var1, int var2) {
        System.out.println("相加的值是: " + var1 + " + " + var2);
        return var1 + var2;
    }

}
