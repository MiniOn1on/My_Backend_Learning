package com.day2.demo1;


import java.util.Scanner;

public class day1_2_scanner {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(num1+num2);
    }
}
