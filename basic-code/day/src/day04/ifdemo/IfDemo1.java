package day04.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 100){
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }
    }
}
