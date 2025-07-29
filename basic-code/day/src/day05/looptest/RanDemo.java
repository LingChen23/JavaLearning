package day05.looptest;

import java.util.Random;
import java.util.Scanner;

public class RanDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int res = 0;

        int num = random.nextInt(100) + 1; //0-9
        while(res != num){
            res = scanner.nextInt();
            count ++;
            if(count == 3){
                System.out.println("baodi");
                return;
            }
            if(res > num){
                System.out.println("big");
            }else if(res < num){
                System.out.println("small");
            }else{
                System.out.println("good!");
                //return;
            }
        }
        System.out.println(num);
    }
}
