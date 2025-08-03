package day06.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 44, 55};
        int[] arr2 = {12, 22, 33, 44, 56};

        System.out.println(equales(arr, arr2));

    }

    public static boolean equales(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++){

                if(arr1[i] != arr2[i]){
                    return false;
                }

        }

        return true;
    }
}
