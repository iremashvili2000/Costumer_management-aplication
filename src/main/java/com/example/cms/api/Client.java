package com.example.cms.api;

public class Client {
    public String getLastname() {
        return lastname;
    }

    public Client(String name, String lastname, int id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String name;
    private String lastname;

    public Client(String name, String lastname, int id, Money dzengi) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.dzengi = dzengi;
    }

    private int id;



    private Money dzengi;
    private String message;

}
