package day04.Test;

public class Test02 {
    public static void main(String[] args) {
        double phone = 7988;
        double old = 1500;

        if((phone - old) > (phone * 0.8)){
            System.out.println("考虑以旧换新");
        }else{
            System.out.println("不以旧换新");
        }
    }
}
