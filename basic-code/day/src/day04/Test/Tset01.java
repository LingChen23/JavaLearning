package day04.Test;

import java.util.Scanner;

public class Tset01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 1000;
        int vip = sc.nextInt();

        if(vip == 1){
            price *= 0.9;
            System.out.println(price);
        } else if (vip == 2) {
            price *= 0.8;
            System.out.println(price);
        }  else if (vip == 3) {
            price *= 0.7;
            System.out.println(price);
        } else {
            System.out.println("不打折！");
        }
    }
}
