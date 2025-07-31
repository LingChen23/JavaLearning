package day05.Test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[] arr =  {12,14,23,45,66,68,70,77,90,91};
        int[] arr1= new int[arr.length + 1];

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= val) {
                arr1[i] = arr[i];
                index = i + 1;
            }else{
                arr1[i + 1] =  arr[i];
            }
        }
        arr1[index] = val;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
