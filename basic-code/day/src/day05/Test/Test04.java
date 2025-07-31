package day05.Test;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int nums = 0;

        for (int i = 0; i < arr.length ; i++) {
            nums = nums * 10 + arr[i];
        }

        System.out.println(nums);
    }
}
