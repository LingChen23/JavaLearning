package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class Dating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己衣服的时髦度");
        int a = sc.nextInt();
        System.out.println("请输入对方衣服的时髦度");
        int b = sc.nextInt();

        System.out.println(a > b);
    }
}
