package com.day3.ObjectOrient;

public class thisShow {
    private int age;

    public void method(){
        int age=10;
        System.out.println(age);
        System.out.println(this.age);
    }
    public void setAge(int age){
        if(age>=18){
            this.age=age;
        }else {
            System.out.println("年龄设置错误");
        }
    }
    //表示当前对象this.成员变量，用于区分局部变量和成员变量
}
