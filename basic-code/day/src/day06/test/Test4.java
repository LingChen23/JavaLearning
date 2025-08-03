package day06.test;

public class Test4 {
    public static void main(String[] args) {
        double res = getAbs(0.9);
        System.out.println(res);
    }

    public static double getAbs(double a){
        if(a < 0){
            a = -a;
        }
        return a;
    }
}
