package day04.ifdemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        //电影院选座 ticket
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >=0 && num<=100){
            if(num % 2 != 0){
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }

    }
}
