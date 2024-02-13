package org.javabank.services;

import org.javabank.entities.CardHolder;

import java.util.Scanner;

public class CardAuthenticator {
    private final CardManager cardManager;

    public CardAuthenticator(CardManager cardManager) {
        this.cardManager = cardManager;
    }

    public CardHolder authenticateCardHolder() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor insira o numero do cartão: ");
        Long cardNumber = scanner.nextLong();
        System.out.print("Por favor insira o PIN: ");
        short pin = scanner.nextShort();
        CardHolder cardHolder = cardManager.getCardHolder(cardNumber);

        if (cardHolder != null && cardHolder.getPin() == pin) {
            System.out.println("Titular do cartão autenticado: " + cardHolder.getFirstName() + " " + cardHolder.getLastName());
            return cardHolder;
        } else {
            System.out.println("Autenticação falhou.");
            return null;
        }
    }
}
