package day06.methoddemo;

public class Demo1 {
    public static void main(String[] args) {
        playGame();
        playGame();
        playGame();
    }

    //定义一个方法

    public static void playGame(){
        System.out.println("选游戏");
        System.out.println("开局");
        System.out.println("对线");
        System.out.println("结束");
    }
}
