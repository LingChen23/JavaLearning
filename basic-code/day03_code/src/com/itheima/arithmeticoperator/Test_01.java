package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //百位
        System.out.println("百位是：" + num /100 % 10);
        //
        System.out.println("十位是：" + num /10 % 10 );

        System.out.println("个位是：" +  num % 10 );
    }
}
