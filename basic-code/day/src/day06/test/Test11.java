package day06.test;

import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
        int[] price = {2, 588, 888, 1000, 10000};


        int[] newPrice = order(price);

        for(int i = 0; i < newPrice.length; i++){
            System.out.println(newPrice[i] + "元的奖金被抽出");
        }
    }

    public static int[] order(int[] arr){
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            int index = r.nextInt(5);

            while(isExist(newArr, arr[index])){
                index = r.nextInt(5);
            }

            newArr[i] = arr[index];
            arr[index] = 0;
        }

        return newArr;
    }

    public static boolean isExist(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                return true;
            }
        }

        return false;
    }
}
