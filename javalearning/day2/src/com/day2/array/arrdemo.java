package com.day2.array;

public class arrdemo {
    static void main(String[] args) {
        int [] arr=new int[] {1,2,3};
        //简写
        int [] arr2={1,2,3};

        //字符串数组
        String [] arr3={"abc","bcd","cde"};
        System.out.println(arr);//[I@6acbcfc0打印的是数组的地址
        System.out.println(arr[0]);//1
        System.out.println(arr.length);//length原生自带
        //数组快速遍历(idea自带)
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
