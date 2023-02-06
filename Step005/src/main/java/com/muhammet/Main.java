package com.muhammet;

public class Main {
    public static void main(String[] args) {
        IPrinter printer =
                MyFramework.INSTANCE
                        .getObjectInstance("com.muhammet.MessageProviderTR",
                                "com.muhammet.ErrorPrinter");
        printer.print();
    }
}