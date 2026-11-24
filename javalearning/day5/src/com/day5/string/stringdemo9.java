package com.day5.string;

public class stringdemo9 {
    //需求:整数字符串变int整数,将两个整数字符串相乘
    static void main(String[] args) {
        String str1="11";
        String str2="22";
        char []strCharArray=str1.toCharArray();
        int num1=stringToInt(strCharArray);
        int num2=stringToInt(str2.toCharArray());
        System.out.println(num1*num2);
    }
    private static int stringToInt(char[] strCharArray) {
        int sum=0;
        for (int i = 0; i < strCharArray.length; i++) {
            sum=sum*10+(strCharArray[i]-'0');
        }
        return sum;
    }
}
