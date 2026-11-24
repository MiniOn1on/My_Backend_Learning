package com.day3.ObjectOrient;

public class constructShow {
    private String name;
    private  int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
    //如果我们自己写了一个构造方法
    //那么虚拟机就不会再给我们加空参构造方法
    public constructShow() {
    }
    //有参构造
    public constructShow(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //推荐不管是否使用都要把有参和无参两种构造方法都写上
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
//标准的JavaBean类
//        类名需要见名知意
//成员变量使用private修饰
//        提供至少两个构造方法
//无参构造方法
//        带全部参数的构造方法
//成员方法
//提供每一个成员变量对应的setXxx()/getXxx()）
//如果还有其他行为，也需要写上