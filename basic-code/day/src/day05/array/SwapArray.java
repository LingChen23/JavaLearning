package day05.array;

public class SwapArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for(int i = 0, j = array.length - 1; i < j; i++, j--){
            int temp = array[i];

            array[i] = array[j];
            array[j] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
