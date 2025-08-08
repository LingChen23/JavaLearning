package com.itheima.tese1;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("hai");
        gf1.setAge(18);
        gf1.setGender("萌妹子");

        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        System.out.println(gf1.getName());

        gf1.eat();
        gf1.sleep();
    }
}
