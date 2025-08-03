package day06.test;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = { 222, 23, 44, 34, 45, 23};
        changeVal(arr, 1, 3, 100);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void changeVal(int[] arr, int from, int to, int val){
        for(int i = from; i < to; i++){
            arr[i] = val;
        }
    }

}
