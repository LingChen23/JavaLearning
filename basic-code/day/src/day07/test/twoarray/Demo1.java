package day07.test.twoarray;

public class Demo1 {
    public static void main(String[] args) {
        //1. 静态初始化
        int[][] arr= new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        //遍历二维数组
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "| ");
            }
            System.out.println();
        }
    }
}
