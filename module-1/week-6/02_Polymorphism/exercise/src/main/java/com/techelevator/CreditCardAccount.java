package com.techelevator;

public class CreditCardAccount implements Accountable{
    private String accountHolderName;
    private String cardNumber;
    private int debt;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        return -debt;
    }

    public CreditCardAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.cardNumber = accountNumber;
    }

    public int pay(int amountToPay){
        if(amountToPay>0){
            debt = -(getBalance() + amountToPay);
            return getDebt();
        }
        return getDebt();

    }
    public int charge(int amountToCharge){
        if(amountToCharge>0){
            debt = -(getBalance() - amountToCharge);
            return getDebt();
        }
        return getDebt();
    }
}
