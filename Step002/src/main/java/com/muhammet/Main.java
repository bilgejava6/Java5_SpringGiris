package com.muhammet;

public class Main {
    public static void main(String[] args) {
        Print print = new Print();
        print.printMessage(MessageType.ERROR);
        print.printMessage(MessageType.STANDART);
    }
}