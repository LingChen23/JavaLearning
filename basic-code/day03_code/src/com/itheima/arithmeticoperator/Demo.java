package com.itheima.arithmeticoperator;

public class Demo {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);
        // -
        System.out.println(5 - 1);
        // *
        System.out.println(7 * 9);
        // /

        //如果计算的时候由小数参与,结果有可能不精确
        // +
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

        // %
        System.out.println(3 % 2);
    }
}
