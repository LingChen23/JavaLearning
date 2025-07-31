package day06.methoddemo;

public class Demo2 {
    public static void main(String[] args) {
        girlFriend();
        getSum();
    }

    public static void girlFriend(){
        String name = "小月月";
        int age = 18;

        System.out.println(name + " " + age);
    }

    public static void getSum(){
        int a = 0;
        int b = 200;

        int sum = a + b;
        System.out.println(sum);
    }
}
