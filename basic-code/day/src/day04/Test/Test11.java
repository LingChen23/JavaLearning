package day04.Test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nn = n;
        int res = 0;

        while(n > 0){
            int ge = n % 10;
            res = res * 10 + ge;

            n /= 10;
        }

        System.out.println("res:"+res);
        if(res == nn){

            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
