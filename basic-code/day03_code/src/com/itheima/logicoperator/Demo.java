package com.itheima.logicoperator;

public class Demo {
    public static void main(String[] args) {
        //& 两边都为真，为真
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        //|
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println(false | true);

        //^ 不同为true
        System.out.println("^");
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //!
        System.out.println("!");
        System.out.println(!false);
        System.out.println(!true);
    }
}
