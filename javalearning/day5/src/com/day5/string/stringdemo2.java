package com.day5.string;

import java.util.Scanner;

public class stringdemo2 {

    static void main(String[] args) {
        //1.键盘录入字符串并进行遍历
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        //str.length().fori
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);//获取字符串中索引为i的字符
            System.out.println(c);
        }
    }
}
