package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    public static final int VIP = 25000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts(){
        Accountable[] temp = new Accountable[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            temp[i] = accounts.get(i);
        }
        return temp;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }
    public boolean isVip(){
        int sum=0;
        for (int i = 0; i < getAccounts().length; i++) {
            sum = sum + getAccounts()[i].getBalance();
        }
        if(sum>=VIP){
            return true;
        }
        return false;
    }
}
