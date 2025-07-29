package day04.loopdemo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1; i <= 5; i++){
            sum += i;
        }

        System.out.println(sum);


        int sumEven = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2== 0){
                sumEven += i;
            }
        }

        System.out.println(sumEven);


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum = 0;

        for(int i = num1; i <= num2; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum++;
            }
        }

        System.out.println(sum);


        for (int i = 0; i < 100; i++) {
            
        }
    }
}
