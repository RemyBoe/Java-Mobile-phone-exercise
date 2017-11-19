package com.company;

import java.util.ArrayList;

public class Contacts {

    private String phonenumber;
    private String name;

    public Contacts(String phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

}
