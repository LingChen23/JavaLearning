package day07.test;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int from = sc.nextInt();
        int to = sc.nextInt();
        int count = 0;

        for(int i = from; i <= to; i++){
            if(getPrime(i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static int getPrime(int n){
        if(n == 1 || n == 2){
            return 0;
        }
        for(int j = 2; j <= sqrt(n); j++){
            if(n % j == 0){
                return j;   //不是质数
            }
        }
        return 0;
    }
}
