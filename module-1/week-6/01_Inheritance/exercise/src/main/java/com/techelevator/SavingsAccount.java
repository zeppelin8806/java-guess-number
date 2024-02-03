package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        super.withdraw(amountToWithdraw);
        int newBalance = getBalance() - amountToWithdraw;

        if(newBalance<150){
            newBalance = newBalance - 2;
            return newBalance;
        }
        return newBalance;

    }
}
