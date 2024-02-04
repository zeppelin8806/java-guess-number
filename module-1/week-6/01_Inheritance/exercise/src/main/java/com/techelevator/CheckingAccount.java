package com.techelevator;

public class CheckingAccount extends BankAccount {
    public static final int MINIMUM_BALANCE = -100;
    public static final int OVERDRAFT_FEE = 10;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0 && (getBalance() - amountToWithdraw > MINIMUM_BALANCE)) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 0) {
                super.withdraw(OVERDRAFT_FEE);
            }
        }
        return getBalance();
    }
}

