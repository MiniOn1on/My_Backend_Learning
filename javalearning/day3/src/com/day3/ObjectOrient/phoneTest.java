package com.day3.ObjectOrient;

public class phoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Huawei";
        phone1.price = 999.99;
        phone1.call("1234567890");
        phone1.sendMessage("Hello, this is a test message.");
        //同软件包中的类可以访问,只要是public的
        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.price = 9999.99;
        phone2.call("1234567890");
        phone2.sendMessage("Hello, this is a test message.");
    }
//    用来描述一类事物的类，专业叫做：Javabean类。
//    在Javabean类中，是不写main方法的。
//    在以前，编写main方法的类，叫做测试类
//    我们可以在测试类中创建javabean类的对象并进行赋值调用。

//    一个Java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名。
//    实际开发中建议还是一个文件定义一个class类。
}
