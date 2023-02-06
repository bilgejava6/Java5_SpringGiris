package com.muhammet;

public class Main {
    public static void main(String[] args) {
        IProvider provider;
        IPrinter printer;

        provider = new MessageProviderTR();
        printer = new DefaultPrinter();
        printer.setProvider(provider);
        printer.print();

    }
}