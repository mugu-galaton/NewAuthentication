package com.example.newauthentication;

import java.util.ArrayList;

public class userModel {
    private ArrayList<String> passwords;
    private int Max;
    private int counter;

    private String firstname, lastname, dob, mail, phone_number;

    public userModel(ArrayList<String> passwords, int max, int counter, String firstname, String lastname, String dob, String mail, String phone_number) {
        this.passwords = passwords;
        Max = max;
        this.counter = counter;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.mail = mail;
        this.phone_number = phone_number;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(ArrayList<String> passwords) {
        this.passwords = passwords;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
