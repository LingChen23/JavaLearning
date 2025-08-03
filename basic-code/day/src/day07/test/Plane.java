package day07.test;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int m = sc.nextInt();
        int cabin = sc.nextInt();
        System.out.println(price(n,m,cabin));
    }

    public static double price(double price, int month, int cabin){
        if(month >= 5 && month <= 10){
            if(cabin == 0){
                return price * 0.9;
            }else if(cabin == 0){
                return price * 0.85;
            }else{
                System.out.println("没有这个舱位");
                return 0;
            }
        }else if(month >= 1 && month <= 4 || month >= 11 && month <= 12){
            if(cabin == 1){
                return price * 7;
            }else if(cabin == 1){
                return price * 0.65;
            }else{
                System.out.println("没有这个舱位");
                return 0;
            }
        }else{
            System.out.println("月份不合格");
            return 0;
        }

    }

    public static double price(double ticket, int seat, double v0, double v1){
        if(seat == 0) {
            return ticket * v0;
        }else if(seat == 1) {
            return ticket * v1;
        }else{
            return 0;
        }
    }
}

