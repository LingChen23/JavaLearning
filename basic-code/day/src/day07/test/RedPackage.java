package day07.test;

import java.util.Random;

public class RedPackage {
    public static void main(String[] args) {
        int[] num = {2, 588, 888, 1000, 10000};

//        int[] result = new int[num.length];

        Random random = new Random();
//        for(int i = 0; i < num.length;){
//            int index = random.nextInt(num.length);
//            if(!repeat(result, num[index])){
//                result[i++] = num[index];
//            }
//        }
        for(int i = 0; i < num.length; i++){
            int index = random.nextInt(num.length);
            int temp = num[index];
            num[index] = num[i];
            num[i] = temp;
        }

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static boolean repeat(int[] arr, int num){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }

        return false;
    }
}
