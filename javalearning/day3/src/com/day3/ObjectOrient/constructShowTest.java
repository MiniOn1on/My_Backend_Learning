package com.day3.ObjectOrient;

public class constructShowTest {
    public static void main(String[] args) {
        constructShow cs = new constructShow();
        constructShow cs2 = new constructShow("Tom", 18);
        System.out.println(cs2.getName() + " " + cs2.getAge());
    }
}
