package com.day5.string;

public class stringdemo6 {
    static void main(String[] args) {
        String talk="你玩的真好,以后不要再玩了,TMD,CNM";
//        String result=talk.replace("TMD","***");
//        System.out.println(result);
        //定义一个敏感词库
        String[] arr={"TMD","SB","CNM","MLGB","FW"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
