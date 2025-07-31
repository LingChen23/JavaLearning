package day05.Test;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16};
        int[] brr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % 2 != 0){
                brr[left] = arr[i];
                left++;
            }else{
                brr[right] = arr[i];
                right--;
            }
        }

        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i] + " ");
        }
    }
}
