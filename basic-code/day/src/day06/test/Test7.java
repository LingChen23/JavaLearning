package day06.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 44, 34, 45, 23};
        change(arr, 100);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
    public static int[] change(int[] nums, int val){
        for(int i = 0; i < nums.length; i++){
            nums[i] = val;
        }

        return nums;
    }

}
