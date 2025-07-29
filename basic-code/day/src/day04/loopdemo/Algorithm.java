package day04.loopdemo;

public class Algorithm {
    public static void main(String[] args) {
        int quotient = 0;
        int remainder = 0;
        int x = 100; //dividend
        int y = 37;  //divisor

        while(x >= y){
            x -= y;
            quotient++;
        }

        remainder = x;
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
