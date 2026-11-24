package com.day2.Method;

public class MethodOverloading {
    static void main(String[] args) {

        add(1, 2);
        add(1, 2, 3);
        add(1.2,2.2);

    }
//    方法重载
//    在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能。
//    每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载关系,只看参数不看返回值
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    static void add(double a, double b) {
        System.out.println(a + b);
    }
    static void add(double a, double b, double c) {
        System.out.println(a + b + c);
    }
}
