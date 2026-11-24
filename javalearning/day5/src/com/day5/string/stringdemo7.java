package com.day5.string;

public class stringdemo7 {
    static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        String s3=s2+"c";
        System.out.println(s1==s3);//false

        String s4="abc";
        String s5="a"+"b"+"c";
        System.out.println(s4==s5);//true

        //关键看加法时是否有变量参与,如果无变量参与,编译器会直接将"a"+"b"优化成"ab"
        //有变量参与则会底层调用StringBuilder的append方法,new一块新空间存在堆中,与串池中的"ab"不是同一个地址
    }
}
