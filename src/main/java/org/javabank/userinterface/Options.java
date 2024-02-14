package org.javabank.userinterface;

import org.javabank.entities.CardHolder;

import org.javabank.services.BankOperations;
import org.javabank.services.CardAuthenticator;
import org.javabank.services.CardManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {

    private static final int DEPOSIT = 1;
    private static final int CASH_OUT = 2;
    private static final int SHOW_BALANCE = 3;
    private static final int QUIT = 4;

    private void showOptions() {
        System.out.println("Por favor, escolha uma das opções");
        System.out.println("1. Depósito");
        System.out.println("2. Saque");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Sair");
    }

    public void interfaceLoop() {
        BankOperations bankOperations = new BankOperations();
        CardManager cardManager = new CardManager();

        CardAuthenticator cardAuthenticator = new CardAuthenticator(cardManager);

        CardHolder cardHolder = null;
        while (cardHolder == null) {
            cardHolder = cardAuthenticator.authenticateCardHolder();
        }

        int numberOption;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                showOptions();
                numberOption = scannerOptions(scanner);
                try {
                    switch (numberOption) {
                        case DEPOSIT:
                            System.out.print("Digite o valor a ser depositado: ");
                            double depositMoney = scanner.nextDouble();
                            double amountNowDeposit = bankOperations.deposit(cardHolder, depositMoney);
                            System.out.println("Deposito feito com sucesso, saldo atual: " + amountNowDeposit);
                            break;
                        case CASH_OUT:
                            System.out.print("Digite o valor a ser retirado: ");
                            double moneyOut = scanner.nextDouble();
                            bankOperations.cashOut(cardHolder, moneyOut);
                            break;
                        case SHOW_BALANCE:
                            System.out.println("Saldo atual: " + bankOperations.getBalance(cardHolder));
                            break;
                        case QUIT:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                }
            } while (numberOption != 4);
        }
    }

        private int scannerOptions(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um número");
            showOptions();
            scanner.next();
            return scannerOptions(scanner);
        }
    }
}

