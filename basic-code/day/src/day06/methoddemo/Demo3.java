package day06.methoddemo;

public class Demo3 {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义的格式和调用的格式
        getSum(10, 20);
        getSum(1000, 200);
    }

    public static void getSum(int num1, int num2){
        int res = num1 + num2;

        System.out.println(res);
    }
}
