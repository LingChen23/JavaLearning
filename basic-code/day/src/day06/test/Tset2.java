package day06.test;

public class Tset2 {
    public static void main(String[] args) {
        int a = 20, c=70, b=30;
        System.out.println(getMax(a, b, c));
    }

    public static int getMax(int a, int b, int c){
        int temp = a > b ? a : b;
        temp = temp > c ? temp : c;

        return temp;
    }
}
