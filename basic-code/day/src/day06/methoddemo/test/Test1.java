package day06.methoddemo.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 44, 55};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else{

                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
