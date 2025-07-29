package day04.loopdemo;

public class whileDemo2 {
    public static void main(String[] args) {
        double paper = 0.1;
        double height = 8844430;
        int count = 0;
        while(paper < height){
            height *= 2;
            count++;
        }

        System.out.println(count);
    }
}
