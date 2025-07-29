package day04.switchdemo;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择按键1 - 4");
        int num = sc.nextInt();

        switch(num){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            //case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
