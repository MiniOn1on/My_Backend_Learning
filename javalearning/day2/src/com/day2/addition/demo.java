package com.day2.addition;

public class demo {
    static void main(String[] args) {
        System.out.println(3.7+"abc");//"3.7abc"
        System.out.println("abc"+true);//"abctrue"
        System.out.println(1+2+"abc"+2+1);//"3abc21"
        //加法从左到右,如果遇到字符串,则转为字符串拼接
    }
}
