package day06.methoddemo;

public class overloaddemo {
    public static void main(String[] args) {
        long a = 200, b = 300;
        System.out.println(isSame(a,b));
        System.out.println(isSame((byte)100,(byte)103));
        System.out.println(isSame((short)100,(short)300));
        System.out.println(isSame(100,100));

    }

    public static boolean isSame(long a, long b){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(byte a, byte b){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(short a, short b){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(int a, int b){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }
}
