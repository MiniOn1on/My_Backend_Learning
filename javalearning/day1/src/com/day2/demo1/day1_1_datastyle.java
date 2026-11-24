package com.day2.demo1;

public class day1_1_datastyle {
    static void main() {
        System.out.print(1);//不换行打印
        System.out.println(666);
        System.out.println(77.7);
        System.out.println('a');
        System.out.println("abc");
        System.out.println("abc"+'\t');//将前面内容长度补齐到8的整数倍,在此处\t=5个空格
        int a=1,b=2;
        System.out.println(0123);//8进制
        System.out.println(0x123);//16进制
        System.out.println(0b1010111101);//2进制

        byte c=10;
        short d=100;
        int e=100000;
        long f=9999999999999L;//long类型变量最后一定要加l或L,最好写L
        System.out.println(f);
        float g=10.3f;//float类型变量最后一定要加f或F,最好写F
        double h=0.1;
        char i='我';//char类型变量一定要用单引号且只能有一个字符
    }
}
