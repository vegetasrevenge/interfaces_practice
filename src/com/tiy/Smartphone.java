package com.tiy;

import java.util.Scanner;

public class Smartphone implements Comparable, Calling, TextMessaging  {
    public boolean isConnected;
    public boolean paidBill = true;
    public double contactNum;
    public String outGoing;


    public Smartphone() {

    }

    public void connect() {
        if(paidBill == true) {
            isConnected = true;
        } else {
            isConnected = false;
        }
    }

    public void dialOut() {
        connect();
        if (isConnected == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a phone number -");
            setContactNum(sc.nextDouble());
            System.out.println("Call " + this.getContactNum() + "?");
            System.out.println("Dialing.....");
        }
    }

    public void sendMessage() {
        connect();
        if(isConnected == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a phone number to text -");
            setContactNum(sc.nextDouble());
            System.out.println("What is your message?");
            Scanner sc2 = new Scanner(System.in);
            String input = sc2.nextLine();
            setOutGoing(input);
            System.out.println("Recipient: " + this.getContactNum() + "\n" + "Message Body: " + this.getOutGoing());
        }
    }

    @Override
    public void answerCall() {

    }

    @Override
    public void hangUp() {

    }

    @Override
    public void typeMessage() {

    }

    @Override
    public void receiveMessage() {

    }

    public void setContactNum(double contactNum) {
        this.contactNum = contactNum;
    }

    public void setOutGoing(String outGoing) {
        this.outGoing = outGoing;
    }

    public double getContactNum() {
        return contactNum;
    }

    public String getOutGoing() {
        return outGoing;
    }
}
