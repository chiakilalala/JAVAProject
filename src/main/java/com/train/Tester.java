package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Please enter number of tickets");
        Scanner scanner = new Scanner(System.in);
        int tickets = scanner.nextInt();

        System.out.println("How many round-trip tickets:");
        int round = scanner.nextInt();
        Ticket t = new Ticket(tickets,round);
        t.print();
    }
}


//	1. 詢問使用者要購買張數，如下:
//            Please enter number of tickets:
//            2. 取得使用者輸入的張數後，再詢問幾張來回票，如下:
//            How many round-trip tickets:
//            3. 最後印出本次的張數、來回票數與總金額，如下:
//            Total tickets: 5
//            Round-trip: 3
//            Total: 7400
