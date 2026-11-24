package com.day2.switchcase;

import java.util.Scanner;

public class switchdemo {
    static void main(String[] args) {

        int number = 2;
        //第一种写法:switch多分支
        switch (number) {
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            default:
                System.out.println("number is not 1 or 2");
        }

        //第二种写法:省略break
        switch (number) {
            case 1 -> {
                System.out.println("number is 1");
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("number is 2");
                System.out.println("二");
            }
            default -> {
                System.out.println("number is not 1 or 2");
            }
        }
        //推荐第一种写法


        // case穿透
        //无穿透
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("week is not 1 or 2 or 3 or 4 or 5 or 6 or 7");
                break;
        }
        //有穿透
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("week is not 1 or 2 or 3 or 4 or 5 or 6 or 7");
                break;
        }
        //再简化
        switch (week) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("week is not 1 or 2 or 3 or 4 or 5 or 6 or 7");
                break;
        }
        //再简化
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("week is not 1 or 2 or 3 or 4 or 5 or 6 or 7");
        }
    }

}
