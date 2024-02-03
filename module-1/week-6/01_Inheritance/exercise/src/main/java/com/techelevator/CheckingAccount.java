package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw){
        super.withdraw(amountToWithdraw);
        int tempBalance;
        int negBalance;
        if(getBalance() >0){
            tempBalance = getBalance()-amountToWithdraw;
            if(tempBalance<0){
                negBalance = tempBalance - 10;
                return negBalance;
            }
            return tempBalance;
        }
        if(getBalance() > -100 && getBalance() >0){
            tempBalance = getBalance()-amountToWithdraw;
            if(tempBalance>-100){
                tempBalance = tempBalance -10;
                return tempBalance;
            } else if (tempBalance < 100) {
                return getBalance();
            }
            return tempBalance;
        }
        return getBalance();
    }


}
