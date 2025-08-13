package com.itheima.cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setBreed("波斯猫");
        cat.setColor("黄色");
        cat.eat();
        cat.catchMouse();
        Dog dog = new Dog();
        dog.setBreed("柴犬");
        dog.setColor("黑色");
        dog.eat();
        dog.lookHome();
    }
}
