package model.builder;

import model.Client;

public class ClientBuilder {

    private final Client client;

    public ClientBuilder(){
        client = new Client();
    }

    public ClientBuilder setIdentityCardNumber(Long identityCardNumber){
        client.setIdentityCardNumber(identityCardNumber);
        return this;
    }

    public ClientBuilder setPersonalNumericalCode(Long personalNumericalCode){
        client.setPersonalNumericalCode(personalNumericalCode);
        return this;
    }

    public ClientBuilder setAddress(String address){
        client.setAddress(address);
        return this;
    }


    public Client build(){
        return client;
    }
}
