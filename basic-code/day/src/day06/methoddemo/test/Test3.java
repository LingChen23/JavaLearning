package day06.methoddemo.test;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result = copyOfRange(array, 1, 3);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] result = new int[to - from];

        for(int i = from; i < to; i++){
            result[i - from] = arr[i];
        }

        return result;
    }
}
