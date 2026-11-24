package com.day5.string;

public class stringdemo1 {
    static void main(String[] args) {
        //1.直接赋值
        String str1="abc";
        //2.new方法
        //空参构造
        String str2=new String();
        System.out.println(str2);//输出""
        //带参构造
        String str3=new String("abc");//实际没啥用
        System.out.println(str3);//输出"abc"
        //字符数组
        //需求:要修改字符串的内容(正常情况字符串是不可修改的)
        char[] chs={'a','b','c'};
        String str4=new String(chs);
        System.out.println(str4);//输出"abc"
        //字节数组
        //应用场景:网络中传递的都是字节信息
        byte[] bytes={97,98,99};
        String str5=new String(bytes);
        System.out.println(str5);//输出"abc"


        //字符串比较
        //==号,基本数据类型比较的是值,引用数据类型比较的是地址
        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        String s3="AbC";
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equalsIgnoreCase(s3));//true(忽略大小写)
    }
}
