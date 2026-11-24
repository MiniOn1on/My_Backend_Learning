package com.day5.string;

import java.util.Scanner;

public class stringdemo3 {
    static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c>='A'&&c<='Z') {
                bigCount++;
            }else if (c>='a'&&c<='z') {
                smallCount++;
            }else if (c>='0'&&c<='9') {
                numberCount++;
            }
        }
        System.out.println("大写字母字符出现的次数为："+bigCount);
        System.out.println("小写字母字符出现的次数为："+smallCount);
        System.out.println("数字字符出现的次数为："+numberCount);

    }
}
