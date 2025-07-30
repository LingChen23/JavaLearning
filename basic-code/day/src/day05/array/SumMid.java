package day05.array;

import java.util.Random;

public class SumMid {
    public static void main(String[] args) {
        Random r = new Random();

        int[] array = new int[10];

        //1. 初始化
        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100) + 1;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //2.
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }


        System.out.println(sum);

        double avg = sum / array.length;
        System.out.println(avg);
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < avg){
                count++;
            }
        }
        System.out.print(count + " ");
    }
}
