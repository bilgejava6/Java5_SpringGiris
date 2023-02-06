package com.muhammet;

public class Main {
    public static void main(String[] args) {
        FactoryBuilder factoryBuilder = FactoryBuilder.getInstance();
        IProvider provider = factoryBuilder.getProvider();
        IPrinter printer = factoryBuilder.getPrinter();
        printer.setProvider(provider);
        printer.print();
    }
}