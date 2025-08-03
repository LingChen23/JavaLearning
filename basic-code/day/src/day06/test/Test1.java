package day06.test;

public class Test1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 80;

        System.out.println(getMin(a,b));
    }

    public static int getMin(int a, int b){
        if(a  < b){
            return a;
        }else{
            return b;
        }
    }

}
