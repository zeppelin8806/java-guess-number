package com.techelevator;

public class SavingsAccount extends BankAccount{
    public static final int LOW_BALANCE = 150;
    public static final int SERVICE_CHARGE = 2;
    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        if(amountToWithdraw > 0 && (getBalance() - amountToWithdraw >= SERVICE_CHARGE)){
            super.withdraw(amountToWithdraw);
            if(getBalance() < LOW_BALANCE){
                super.withdraw(SERVICE_CHARGE);
            }
        }
        return getBalance();

    }
}
