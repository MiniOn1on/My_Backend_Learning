package com.day5.stringjoiner;

import java.util.StringJoiner;

public class stringjoinerdemo1 {
    static void main(String[] args) {
        //无空参构造
        //有参构造
        //单参数:间隔符
        StringJoiner sj = new StringJoiner(",");
        //三参数:间隔符，前缀，后缀
        StringJoiner sj2=new StringJoiner(",","[","]");
        //添加元素
        sj.add("a");
        sj.add("b");
        sj.add("c");
        System.out.println(sj);
        //长度
        int length=sj.length();
        System.out.println(length);//包括前缀和后缀和间隔符
        //转字符串
        String str=sj.toString();
        System.out.println(str);
    }
}
