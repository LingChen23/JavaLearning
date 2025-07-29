package day04.switchdemo;

public class Demo1 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";

        switch(noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "泡面":
                System.out.println("吃泡面");
                break;
            case "面":
                System.out.println("吃面");
                break;
            default:
                System.out.println("吃其他");
                break;
        }
    }
}
