package day06.methoddemo.test;

public class Test2 {
    public static void main(String[] args) {
        double[] arr = {12.3, 23, 2, 23, 24};
        double max = getMax(arr);

        System.out.println(max);
        System.out.println(contains(arr, 230));
    }

    public static double getMax(double arr[]){
        double max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean contains(double arr[], double num){

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }

        return false;
    }
}
