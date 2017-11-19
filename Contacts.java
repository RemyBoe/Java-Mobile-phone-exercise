package com.company;

import java.util.ArrayList;

public class Contacts {

    private int phonenumber;
    private String name;

    public Contacts(int phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

}
