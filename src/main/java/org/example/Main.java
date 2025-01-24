package org.example;

import org.example.mobile.MobilePhone;
import org.example.mobile.Contact;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone("5435243254325",new ArrayList<>());
        mobilePhone.addNewContact(new Contact("emir","43542643264327"));
        mobilePhone.addNewContact(new Contact("kerem","5432543254325"));
        mobilePhone.addNewContact(new Contact("mehmet","754453252525"));
        mobilePhone.addNewContact(new Contact("buğra","3265437474777"));
        mobilePhone.addNewContact(new Contact("kaan","32542627272766"));
        mobilePhone.printContact();
    }
}
