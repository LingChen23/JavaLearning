package com.itheima.student;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
