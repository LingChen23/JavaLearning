package day04.Test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vip = sc.nextInt();
        double money = sc.nextDouble();

        if(vip == 0){
            if(money >= 100){
                money *= 0.9;
            }
        }else{
            if(money < 200){
                money *= 0.8;
            }else{
                money *= 0.75;
            }
        }

        System.out.println(money);
    }
}
