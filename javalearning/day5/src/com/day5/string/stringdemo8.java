package com.day5.string;

import java.util.Random;

public class stringdemo8 {
    static void main(String[] args) {
        String s1="abc";
        char [] ch=s1.toCharArray();
    //套路：
    //如果我们看到要修改字符串的内容
    //可以有两个办法：
    //1.用substring进行截取，把左边的字符截取出来拼接到右侧去
    //2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串。


        //需求:给定一个字符串,打乱该字符串
        String str="abcdefg";
        char [] strCharArray=str.toCharArray();
        Random r=new Random();
        for (int i = 0; i < strCharArray.length; i++) {
            char temp=strCharArray[i];
            int randomIndex=r.nextInt(strCharArray.length);
            strCharArray[i]=strCharArray[randomIndex];
            strCharArray[randomIndex]=temp;
        }
        String result=new String(strCharArray);
        System.out.println(result);

    }
}
