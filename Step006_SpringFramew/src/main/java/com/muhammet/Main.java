package com.muhammet;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory =
                new ClassPathXmlApplicationContext("spring.xml");
        IPrinter printer = factory.getBean("printer",IPrinter.class);
        printer.print();
    }
}