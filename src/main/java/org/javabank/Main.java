package org.javabank;

import org.javabank.services.CardManager;
import org.javabank.userinterface.Options;

public class Main {
    public static void main(String[] args) {
        CardManager cardManager = new CardManager();
        Options options = new Options();

        System.out.println(cardManager.getCardHolder( 1122334455667788L));
        //options.interfaceLoop();

    }
}
