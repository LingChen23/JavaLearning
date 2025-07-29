package day04.switchdemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String week = sc.next();

        switch(week){
            case "星期一":
                System.out.println("跑步");
            default:
                System.out.println("输入错误");
            case "星期二":
                System.out.println("游泳");

            case "星期三":
                System.out.println("慢走");

            case "星期四":
                System.out.println("动感单车");

            case "星期五":
                System.out.println("拳击");

            case "星期六":
                System.out.println("爬山");

            case "星期日":
                System.out.println("好好吃一顿");



        }
    }
}
