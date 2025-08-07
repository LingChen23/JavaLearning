package day07.test.twoarray;

public class Demo3 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 64, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int quarterArr[] = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            quarterArr[i] = getSum(arr[i]);
            sum += quarterArr[i];
            System.out.println(quarterArr[i]);
        }
        System.out.println(sum);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

}
