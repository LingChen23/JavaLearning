package day06.test;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 44, 34, 45, 23};
        int[] newArr = copyOf(arr, 3);

        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] +" ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength){
        int newArr[] = new int[newLength];
        for(int i = 0; i < newLength; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
