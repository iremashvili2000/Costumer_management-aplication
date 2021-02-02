package com.example.cms.api;


import java.util.List;

public class CustomCollection {

    private static CustomCollection instance;

    private List<Client> clients;

    private CustomCollection(){}


    public static CustomCollection get(){
        if (instance == null){
            instance =  new CustomCollection();
        }
        return instance;
    }

    public void add(Client client){
        this.clients.add(client);
    }

    public Client get(int index){
        return this.clients.get(index);
    }

    public List<Client> getAllClients(){
        return this.clients;
    }
}
