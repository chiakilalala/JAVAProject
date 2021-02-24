package com.train;

public class Ticket {


    int tickets;
    int round;


    public Ticket(int round, int tickets) {
        this.tickets = tickets;
        this.round = round;

    }
    public void  print(){
        System.out.println("Total tickets:"+tickets+"\t"+"Round-trip:"+round+"\t"+"Total"+"\t"+(int)((tickets - round)*1000+round*2000*0.9));
    }
}
