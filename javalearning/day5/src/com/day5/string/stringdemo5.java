package com.day5.string;

public class stringdemo5 {
    public static void main(String[] args) {
        String phoneNum="13112341234";
        String strStart=phoneNum.substring(0,3);//"131",substring 方法包头不包尾,截取字符串
//        System.out.println(strStart);
        String strEnd=phoneNum.substring(phoneNum.length()-4);//一个参数默认截取到末尾
//        System.out.println(strEnd);
        System.out.println(strStart+"****"+strEnd);
    }
}
