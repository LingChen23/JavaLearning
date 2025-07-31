package day05.Test;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
        }

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println(sum);
    }
}
