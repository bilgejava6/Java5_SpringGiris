package com.muhammet;

public class MessageProviderTR implements IProvider{

    @Override
    public String getMessage() {
        return "Merhaba";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
