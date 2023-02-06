package com.muhammet;

public class MessageProviderDE implements IProvider{
    @Override
    public String getMessage() {
        return "Hallo";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
