package com.day5.stringbuilder;

public class stringbuilderdemo1 {
    static void main(String[] args) {
        //使用StringBuilder的场景:
        //1.字符串拼接
        //2.字符串反转
        //空参构造
        StringBuilder sb =new StringBuilder();
        //有参构造
        StringBuilder sb2 =new StringBuilder("abc");
        System.out.println(sb2);
        //添加元素
        sb2.append("d");
        sb2.append("1");
        sb2.append("2.3");
        sb2.append(true);
        System.out.println(sb2);
        //打印stringbuilder时打印的是属性值而不是地址值

        //反转
        sb2.reverse();//直接把返回值赋值给原字符串容器
        System.out.println(sb2);

        //获取长度
        int length=sb2.length();
        System.out.println(length);

        //再把stringbuilder转换成string
        String str=sb2.toString();
    }
}
