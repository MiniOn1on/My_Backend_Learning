package com.day3.ObjectOrient;

public class Phone {
    String brand;
    double price;
//    成员变量的完整定义格式是：修饰符数据类型变量名称=初始化值；一般无需指定初始化值，存在默认值。
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
