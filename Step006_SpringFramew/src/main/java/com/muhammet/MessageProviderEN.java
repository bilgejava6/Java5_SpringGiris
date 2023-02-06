package com.muhammet;

public class MessageProviderEN implements IProvider{
    @Override
    public String getMessage() {
        return "Hello";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
