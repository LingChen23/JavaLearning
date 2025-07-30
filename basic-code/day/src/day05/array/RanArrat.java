package day05.array;

import java.util.Random;

public class RanArrat {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            int index = random.nextInt(array.length);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
