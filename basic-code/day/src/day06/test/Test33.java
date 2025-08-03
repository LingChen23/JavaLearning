package day06.test;

import java.util.Scanner;

public class Test33 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        getMax(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }


    public static int[] getMax(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
