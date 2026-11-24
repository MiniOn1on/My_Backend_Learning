package com.day4.test2;

public class GameTest {
    static void main(String[] args) {
        Role r1=new Role("onion",100,'男');
        Role r2=new Role("dp",100,'女');
        r1.showRoleInfo();
        r2.showRoleInfo();
        while (true){
            r1.attack(r2);
            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }
        }
    }
}
