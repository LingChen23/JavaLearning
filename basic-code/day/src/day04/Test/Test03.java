package day04.Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        if(num1 > num2){
//            if(num2 > num3){
//                System.out.println(num3);
//            }else{
//                System.out.println(num2);
//            }
//        }else{
//            if(num1 > num3){
//                System.out.println(num3);
//            }else{
//                System.out.println(num1);
//            }
//        }

        if(num1 > num2 && num3 > num2){
            System.out.println(num2);
        }else if(num1 > num3 && num3 < num2){
            System.out.println(num3);
        }else{
            System.out.println(num1);
        }
    }
}
