package com.itheima.manager;

public class Coder {
    private String name;
    private String id;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员" + name + "正在努力写代码");
    }
}
