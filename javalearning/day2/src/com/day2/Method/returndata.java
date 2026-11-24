package com.day2.Method;

public class returndata {
    static void main(String[] args) {
        int[] arr={100,200};
        change(arr);
        System.out.println(arr[0]);
    }

    static void change(int b) {
        b=200;
    }
    static void change(int[] b) {
        //数组传地址
        b[0]=200;
    }
    //idea快捷键ctrl+alt+m提取方法

}
