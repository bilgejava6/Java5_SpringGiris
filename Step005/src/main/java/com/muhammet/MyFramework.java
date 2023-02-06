package com.muhammet;

public class MyFramework {
    private IProvider provider;
    private IPrinter printer;

    private MyFramework(){

    }
    public final static MyFramework INSTANCE;

    static {
        INSTANCE = new MyFramework();
    }

    /**
     *
     * @param classOne -> IProvider
     * @param classTwo -> IPrinter
     * @return
     */
    public IPrinter getObjectInstance(String classOne, String classTwo){
        Object one = null;
        Object two = null;
        try{
            one = Class.forName(classOne).getDeclaredConstructor().newInstance();
            two = Class.forName(classTwo).getDeclaredConstructor().newInstance();
        }catch (Exception exception){
            System.err.println("Bir hata oldu....: "+ exception.toString());
        }
        /**
         * Kullanıcının yanlışlıkla sağlamış olduğu sınıfların tiplerini farklı olması nedeniyle
         * atamaların doğru yapılması için kullanılmıştır.
         */
        if(one instanceof IProvider){
            provider = (IProvider) one;
        }else {
            printer = (IPrinter) one;
         }
        if(two instanceof IPrinter){
            printer = (IPrinter) two;
        }else {
            provider = (IProvider) two;
        }
        printer.setProvider(provider);
        return printer;
    }
}
