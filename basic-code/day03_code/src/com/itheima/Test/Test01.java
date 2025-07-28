package com.itheima.Test;

public class Test01 {
    public static void main(String[] args) {
        //预测子女身高
        double fasterHeight = 175;
        double motherHeight = 165;

        double sonHeight = (fasterHeight + motherHeight) * 1.08 / 2;
        double monHeight = (fasterHeight * 0.923 + motherHeight) / 2;

        System.out.println("儿子身高" + sonHeight);
        System.out.println("女儿身高" + monHeight);
    }
}
