package day07.test;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        double[] score = new double[6];
        Scanner sc = new Scanner(System.in);
        double min = 100;
        double max = 0;
        double sum = 0;

        for(int i = 0; i < 6; i++){
            score[i] = sc.nextDouble();
            sum += score[i];
            if(score[i] < min){
                min = score[i];
            }
            if(score[i] > max){
                max = score[i];
            }
        }
//100 90 98 98 98 98
        double ave = (sum - min - max) / (score.length - 2);

        //System.out.println("sum min max ave" + sum +" " + min+ " " + max +" " + ave);
        System.out.println(ave);
        double[] scores = getScore();
        double MAX = getMax(scores);
        double MIN = getMin(scores);
        double SUM = getSum(scores);
        double avg = (SUM - MIN - MAX) / (scores.length - 2);
        System.out.println(avg);
    }

    //定义数组求评委的打分
    public static double[] getScore(){
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; ){
            double score  = sc.nextDouble();
            if(score >= 0 &&score <= 100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("成绩超出范围，请重新输入，值为" + i);
            }

        }

        return scores;
    }

    public static double getMax(double[] scores){
        double max = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }

        System.out.println("max: " + max);
        return max;
    }

    public static double getMin(double[] scores){
        double min = scores[0];

        for(int i = 1; i < scores.length; i++){
            if(scores[i] < min){
                min = scores[i];
            }
        }

        System.out.println(
                "min: " + min
        );
        return min;
    }

    public static double getSum(double[] scores){
        double sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
           // System.out.println("scores[i]: " + scores[i]);
        }

        System.out.println("sum" + sum);
        return sum;
    }
}
