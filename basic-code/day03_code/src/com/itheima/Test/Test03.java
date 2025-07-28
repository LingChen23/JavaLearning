package com.itheima.Test;

public class Test03 {
    public static void main(String[] args) {
        //点外卖
        double fish = 24;
        double rice = 3;
        double peaunt = 8;

        double min = (fish + rice + peaunt) * 0.8 > (16 + rice + peaunt) ? (16 + rice + peaunt) : (fish + rice + peaunt) * 0.8;
        System.out.println("优惠价" + min);



        //1.求不使用优惠时的总价
        double money1 = 24 + 8 + 3;
        //2.判断折后总价
        money1 = (money1 >= 30 ? money1 * 0.8 : money1);
        //3.求使用优惠时的总价
        double money2 = 16 + 8 + 3;
        //4.判断两种花费哪个更少
        double money = money1 < money2 ? money1 : money2;
        //5.打印最终花费
        System.out.println(money);

        String firstName = "Tomas";
        String familyName = "Zhang";

        System.out.println(firstName + familyName);
    }
}
