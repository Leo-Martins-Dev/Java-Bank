package org.javabank.services;

import org.javabank.entities.CardHolder;

public class BankOperations {
    public double deposit(CardHolder cardHolder, double moneyDeposit) {
        double newAmount = cardHolder.getAmount() + moneyDeposit;
        cardHolder.setAmount(newAmount);
        return newAmount;
    }

    public long getBalance (CardHolder cardHolder){
        return (long) cardHolder.getAmount();
    }

    public void cashOut(CardHolder cardHolder, double moneyOut) {
        double actualMoney = cardHolder.getAmount();
        if (actualMoney < moneyOut){
            System.out.println("Saldo insuficiente, saldo atual: " + actualMoney);
        } else {
            double newAmount = actualMoney - moneyOut;
            cardHolder.setAmount(newAmount);
            System.out.println("Saque realizado com sucesso, saldo atual: " + newAmount);
        }
    }
}
