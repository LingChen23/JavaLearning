package day04.Test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum  = 0;

        int min = num1 > num2 ? num2 : num1;
        int max = num1 > num2 ? num1 : num2;

        for(int i = min; i <= max; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
