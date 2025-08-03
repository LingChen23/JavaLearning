package day06.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(getNums(num));
    }

    public static int getNums(int a){
        int count = 1;

        while(a / 10 != 0){
            count++;
            a /= 10;
        }

        return count;
    }
}
