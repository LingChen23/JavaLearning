package day07.test;

import java.util.Random;

public class TwoBall {
    public static void main(String[] args) {
        //生成中奖号码
        int[] redPrice = new int[6];
        int bluePrice;
        Random random = new Random();
        for(int i = 0; i < redPrice.length;){
            redPrice[i] = random.nextInt(33) + 1;
            if(!contains(redPrice, redPrice[i])){
                i++;
            }
        }
        bluePrice = random.nextInt(16) + 1;
        System.out.println("红球号码为：");
        for(int i = 0; i < redPrice.length; i++){
            System.out.print(redPrice[i] + " ");
        }
        System.out.println("蓝球号码为：" + bluePrice);

        //用户输入号码
        int[] userRed = new int[6];
        int userBlue;
        System.out.println("请输入红球号码：");
        for(int i = 0; i < userRed.length; i++){
            userRed[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("请输入蓝球号码：");
        userBlue = Integer.parseInt(System.console().readLine());

        int price = getPrice(redPrice, bluePrice, userRed, userBlue);
        System.out.println("您的中奖号码为：" + price);
    }

    public static boolean contains(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int getPrice(int[] red, int blue, int[] userRed, int userBlue){
        int redCount = 0;
        int blueCount = 0;
        for(int i = 0; i < red.length; i++){
            for(int j = 0; j < userRed.length; j++){
                if(red[i] == userRed[j]){
                    redCount++;
                }
            }
        }
        if(blueCount == blue){
            blueCount++;
        }
        //6等奖
        if(redCount == red.length && blueCount == 1){
            return 1;
        }else if(redCount == red.length){
            return 2;
        }else if(blueCount == 5 && blueCount == 1){
            return 3;
        }else if(redCount == 5 || (redCount == 4 && blueCount == 1)){
            return 4;
        }else if((redCount == 4) || (blueCount == 1 && (redCount == 3 || redCount == 2))){
            return 5;
        }else if((blueCount == 1) && (redCount ==0 || redCount == 1 || redCount == 2)){
            return 6;
        }else{
            return -1;
        }

    }
}
