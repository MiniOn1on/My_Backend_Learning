package com.day2.experiment;

import java.util.Random;

public class demo1 {
    static void main(String[] args) {
//        需求：
//        定义方法实现随机产生一个5位的验证码
//        验证码格式：
//        长度为5
//        前四位是大写字母或者小写字母
//        最后一位是数字

//    方法：
//            在以后如果我们要在一堆没有什么规律的数据中随机抽取
//            可以先把这些数据放到数组当中
//            再随机抽取一个索引
        char[] ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random r=new Random();
        String result="";
        for (int i = 0; i < 4; i++) {
            result+=ch[r.nextInt(ch.length)];
        }
        result+=r.nextInt(10);
        System.out.println(result);
    }
}
