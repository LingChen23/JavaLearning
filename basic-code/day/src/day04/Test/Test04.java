package day04.Test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y1 = 2.25;
        double y2 = 2.7;
        double y3 = 3.25;
        double y4 = 3.6;

        double money = sc.nextDouble();
        int year = sc.nextInt();

        if(year == 1){
            money = money + money * y1 / 100 *year;
        }else if(year == 2){
            money = money + money * y2 / 100 * year;
        }else if(year == 3){
            money = money + money * y3 /100 *year;
        }else if(year == 5) {
            money = money + money * y4 / 100* year;
        }else{
            System.out.println("error");
        }

        System.out.println(money);
    }
}
