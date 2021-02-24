package com.train.guess;

import java.util.Scanner;
import  java.util.Random;

public class GameFor {

    public static void main(String[] args) {
//        int sum =0;
//        for (int i = 5; i >=1 ; i--) {
//            System.out.println(i);
//        }
//        System.out.println(sum);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=4; i++) {
            System.out.println("please enter a number("+i+"/4):");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次"+number);
            if (number >secret) {
                System.out.println("lower");

            }else if(number < secret){
                System.out.println("higher");
            }else{
                System.out.println("great the number is"+number);
                break;
            }
        }

        System.out.println("end");
    }
}
