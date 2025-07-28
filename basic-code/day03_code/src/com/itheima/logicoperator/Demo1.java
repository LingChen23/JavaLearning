package com.itheima.logicoperator;

public class Demo1 {
    public static void main(String[] args) {
        //1.&&
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        //2.||
        System.out.println("||");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        //3.短路
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);  //11
        System.out.println(b);  //10

        boolean result1 = ++a > 5 || ++b > 5;
        System.out.println(result1);
        System.out.println(a);  //12
        System.out.println(b);  //10

    }
}
