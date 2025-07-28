package com.itheima.logicoperator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * 其中一个为6
        * 和为6的倍数
        * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a == 6) || (b == 6) || ((a + b) % 6 == 0));
    }
}
