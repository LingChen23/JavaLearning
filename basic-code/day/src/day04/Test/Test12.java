package day04.Test;

public class Test12 {
    public static void main(String[] args) {
        int y1 = 2019;
        int y2 = 1949;

        while(y2 < y1){
            System.out.println(y1);
            y1 -= 12;
        }


        for(int i = y2; i <= 2019; i ++){
            if((2019 - i)% 12 == 0){
                System.out.println(i);
            }
        }
    }
}
