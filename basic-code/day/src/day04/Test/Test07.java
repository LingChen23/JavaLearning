package day04.Test;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int cal = sc.nextInt();

        switch(cal){
            case 1-> System.out.println(num1 + num2);
            case 2-> System.out.println(num1 - num2);
            case 3-> System.out.println(num1 * num2);
            case 4-> System.out.println(num1 * 1.0 / num2);
        }
    }
}
