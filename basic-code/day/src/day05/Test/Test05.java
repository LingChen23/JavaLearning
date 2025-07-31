package day05.Test;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 70, 93, 76, 68};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum * 1.0/arr.length;
        System.out.println(avg);
    }
}
