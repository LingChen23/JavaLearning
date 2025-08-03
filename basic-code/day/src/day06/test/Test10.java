package day06.test;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 44, 34, 45, 23};
        int[] newArr = copyOfRange(arr, 1, 3);

        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] +" ");
        }
    }

    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newArr = new int[to-from];

        for(int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
