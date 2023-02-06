package com.muhammet;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryBuilder implements IFactory{
    private IProvider provider;
    private IPrinter printer;
    /**
     * 1- static String değiğşken;
     * 2- static {}
     * 3- constructor
     * 4- {}
     * yukarıda belirtilen-kullanılan türlerin ne işe yaradığını
     * ve hangi sıra ile kullanıldığını araştırınız.
     */
    private static FactoryBuilder instance;
    static {
        instance = new FactoryBuilder();
    }
    private FactoryBuilder(){

    }
    public static FactoryBuilder getInstance() {
        return instance;
    }

    private Properties properties;
    {
        properties = new Properties();
        try{
            /**
             * properties dosyasını yükleyerek içindeki paramerteleri okumak gerekir.
             */
            properties.load(new FileInputStream("application.properties"));
            String providerClass = properties.getProperty("provider");
            String printerClass = properties.getProperty("printer");
            provider = (IProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClass).getDeclaredConstructor().newInstance();
        }catch (Exception exception){
            System.err.println("Bir hata oldu....: "+ exception.toString());
        }
    }



    @Override
    public IPrinter getPrinter() {
        return this.printer;
    }

    @Override
    public IProvider getProvider() {
        return this.provider;
    }
}
