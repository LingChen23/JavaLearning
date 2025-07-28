package day04.ifdemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >=0 && score <=100){
            if(score >= 95){
                System.out.println("送自行车一辆");
            }else if (score >= 90){
                System.out.println("游乐场玩一天");
            }else if(score >= 80){
                System.out.println("变形金刚玩具一个");
            }else{
                System.out.println("挨顿揍，这座城市又多了一个伤心的人");
            }
        }
        else{
            System.out.println("成绩不合法");
        }
    }
}
