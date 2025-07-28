package com.itheima.Test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //每一位数字和
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num / 100 % 10 + num / 10 % 10 + num % 10);
    }
}
