package com.day3.ObjectOrient;

public class PrivateShow {
    private int age;
    private String name;
    private String gender;
//    private是一个权限修饰符
//    可以修饰成员（成员变量和成员方法）
//    被private修饰的成员只能在本类中才能访问
    //针对每一个私有成员变量，都要提供一个set和一个get方法，set用于给成员变量赋值，get用于获取成员变量的值
    //set和get方法是对应成员变量的，所以方法名要和成员变量名一致，只是set方法是set加成员变量名，get方法是get加成员变量名
    public void setAge(int a){
        if(a>=18&&a<=50){
            age = a;
        }else {
            System.out.println("年龄设置错误");
        }
    }
    public int getAge(){
        return age;
    }
}
