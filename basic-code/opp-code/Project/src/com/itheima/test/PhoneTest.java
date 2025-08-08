package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.price = 2900.9;

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.playGame();

        Phone phone1 = new Phone();
        phone1.brand = "小米";
        phone1.price = 2999.9;

        System.out.println(phone1.brand);
        System.out.println(phone1.price);

        phone.call();
        phone.playGame();
    }
}
