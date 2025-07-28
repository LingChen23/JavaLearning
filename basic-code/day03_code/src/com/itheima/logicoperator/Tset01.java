package com.itheima.logicoperator;

import java.util.Scanner;

public class Tset01 {
    public static void main(String[] args) {
        //三元运算符
        Scanner sc = new Scanner(System.in);

        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();

        String same = (weight1 == weight2) ? "相同" : "不同";

        System.out.println(same);

        //求最高身高的和尚 height
        int w1 = sc.nextInt();
        int w2 = sc.nextInt();
        int w3 = sc.nextInt();

        int max = w1 > w2 ? w1 : w2;
        int maxx = max > w3 ? max : w3;

        System.out.println(maxx);
    }
}
