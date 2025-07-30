package day05.array;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {1, 2,3,4,5};

        int[] age = new int[]{12, 23, 45};
        String[] name = new String[3];
        double[] height = new double[4];

        System.out.println(height);//地址值
        age[2] = 100;
        System.out.println(age[2]);
    }
}
