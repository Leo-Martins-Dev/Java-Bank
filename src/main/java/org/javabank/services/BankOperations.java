package org.javabank.services;

import org.javabank.entities.CardHolder;

public class BankOperations {
    public long getBalance (CardHolder cardHolder){
        return (long) cardHolder.getAmount();
    }
}
