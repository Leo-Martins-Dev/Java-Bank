package org.javabank.services;

import org.javabank.entities.CardHolder;

import java.util.ArrayList;
import java.util.List;

public class CardManager {

    private final List<CardHolder> cardHolders;

    public  CardManager(){
        cardHolders = new ArrayList<>();

        CardHolder cardHolder1 = new CardHolder();
        cardHolder1.setNumberCard(1234567812345678L);
        cardHolder1.setPin((short) 1234);
        cardHolder1.setFirstName("Maria");
        cardHolder1.setLastName("Silva");
        cardHolder1.setAmount(2000.0);

        CardHolder cardHolder2 = new CardHolder();
        cardHolder2.setNumberCard(8765432187654321L);
        cardHolder2.setPin((short) 1234);
        cardHolder2.setFirstName("João");
        cardHolder2.setLastName("Santos");
        cardHolder2.setAmount(3000.0);

        CardHolder cardHolder3 = new CardHolder();
        cardHolder3.setNumberCard( 1L);
        cardHolder3.setPin((short) 1234);
        cardHolder3.setFirstName("Ana");
        cardHolder3.setLastName("Pereira");
        cardHolder3.setAmount(4000.0);

        cardHolders.add(cardHolder1);
        cardHolders.add(cardHolder2);
        cardHolders.add(cardHolder3);

    }

    public CardHolder getCardHolder (Long cardNumber){
        for (CardHolder cardHolder : cardHolders){
            if (cardHolder.getNumberCard() == cardNumber) {
                return cardHolder;
            }
        }
        return null;
    }
}
