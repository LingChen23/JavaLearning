package day07.test;

public class Password {
    public static void main(String[] args) {
        int pwd = 1983;
        int[] arr = getArr(pwd);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int num = getNum(arr);
        System.out.println(num);

        int pre = getPre(num);
        System.out.println(pre);
    }

    public static int[] getArr(int pwd){
        int count = 0;
        int num = pwd;
        //数组长度
        while(pwd != 0){
            pwd /= 10;
            count++;
        }
        //数组初始化
        int[] arr = new int[count];
        for(int i = count - 1; i >= 0; i--){
            arr[i] = num % 10;
            num /= 10;
        }

        return arr;
    }

    //加密
    public static int getNum(int[] arr){

        for(int i = 0; i < arr.length; i++){
            arr[i] += 5;
            arr[i] %= 10;
        }

        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num * 10 + arr[i];
        }

        return num;
    }
    public static int getPre(int pwd){
        int[] arr = getArr(pwd);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0 && arr[i] <= 4){
                arr[i] += 10;
            }
            arr[i] -= 5;
        }

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num * 10 + arr[i];
        }

        return num;
    }

}
