package day05.skiploop;

public class Demo1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            if(i == 3){
                break;
            }

        }
    }
}
