package com.day4.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击的方法
    public void attack(Role role){
        //计算造成的伤害
        Random r=new Random();
        int damage=r.nextInt(20)+1;
        //记录被打的人的剩余血量
        int remainBlood=(role.getBlood()-damage) >= 0 ? (role.getBlood()-damage):0;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+"攻击了"+role.getName()+"造成了"+damage+"点伤害," +
                role.getName()+"还剩下"+remainBlood+"点血");
    }
}
