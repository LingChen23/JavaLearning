package day07.test;

public class CopyArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] newArr = copyArr(arr);

        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }

    public static int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];

        for(int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
