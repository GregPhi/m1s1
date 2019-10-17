package com.example.projetcontact;

import androidx.annotation.NonNull;

public class Address {
    private String street;
    private String zipcode;
    private String town;

    public Address(String s,String t,String z){
        this.street = s;
        this.zipcode = z;
        this.town = t;
    }

    public Address(){
        this.street = "";
        this.zipcode = "";
        this.town = "";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @NonNull
    @Override
    public String toString() {
        return "rue : " + this.street + "ville : " + this.getTown() + "numéro de département : " + this.getZipcode();
    }
}