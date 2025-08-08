package com.itheima.tese1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //针对每一个私有成员，提供get和set方法
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("非法参数");
        }

    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
