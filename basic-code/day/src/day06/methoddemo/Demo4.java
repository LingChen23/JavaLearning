package day06.methoddemo;

public class Demo4 {
    public static void main(String[] args) {
        getPerimeter(20, 20);
        getArea(3.13);

        double sum1 = getSum(10, 20, 30);
        double sum2 = getSum(20,34, 40);
        double sum4 = getSum(23, 34, 20);
        double sun3 = getSum(12, 23, 23);

        double sum = sum1 + sum2 + sum4 + sun3;
        System.out.println(sum);

        double area1 = getArea(20,30);
        double area2 = getArea(20,35.2);

        if(area1 > area2){
            System.out.println("第一个长方形面积更大：" + area1);
            System.out.println("第二个长方形面积：" + area2);
        }else{
            System.out.println("第一个长方形面积：" + area1);
            System.out.println("第二个长方形面积更大：" + area2);
        }
    }

    public static void getPerimeter(int length, int width){
        int res = 2 * length + 2 * width;
        System.out.println(res);
    }

    public static void getArea(double radius){
        double area = 3.14 * radius * radius;

        System.out.println(area);
    }

    public static double getSum(int num1, int num2, int num3){

        int result = num1 + num2 + num3;

        return result;
    }

    public static double getArea(double length, double width){
        double area = length * width;

        return area;
    }
}
