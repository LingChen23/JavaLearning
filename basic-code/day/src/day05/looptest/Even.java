package day05.looptest;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num = sc.nextInt();
        boolean flag = true;

        if(num == 1 || num == 2){
            System.out.println(num);
            return;
        }

        for(int i = 2; i <= sqrt(num); i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("是质数");
        }else {
            System.out.println("不是质数");
        }
    }
}
