package com.itheima.manager;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", "1001", 5000, 1000);
        manager.work();

        Coder coder = new Coder();
        coder.setId("1002");
        coder.setName("李四");
        coder.setSalary(3000);
        coder.work();
    }
}
