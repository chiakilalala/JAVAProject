package com.train.guess;


import java.util.Scanner;

import java.util.Random;

public class GameTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (number != secret) {
            System.out.println("please enter a number");
            number = scanner.nextInt();
            System.out.println(number);
            if (number < secret) {
                System.out.println("higher");
            } else if (number > secret) {
                System.out.println("lower");
            } else {
                System.out.println("Great  the number is" + number);
            }

        }


}
}
