package com.itheima.student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("zhangsan",18);

        System.out.println(s2.getAge());
        System.out.println(s2.getName());
    }
}
