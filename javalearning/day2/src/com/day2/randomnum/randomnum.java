
package com.day2.randomnum;


import java.util.Random;
import java.util.Scanner;

public class randomnum {
    static void main(String[] args) {
        Random r=new Random();
        int randomnum=r.nextInt(100);//[0,99]
        Scanner sc=new Scanner(System.in);
        while (true){
            int guessnum=sc.nextInt();
            if(guessnum>randomnum) System.out.println("大了");
            else if (guessnum<randomnum) System.out.println("小了");
            else {System.out.println("恭喜你，猜对了");
            break;
            }
        }

    }
}
