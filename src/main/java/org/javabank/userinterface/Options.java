package org.javabank.userinterface;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {

    private static final int DEPOSIT = 1;
    private static final int CASH_OUT = 2;
    private static final int SHOW_BALANCE = 3;
    private static final int QUIT = 4;

    private void showOptions() {
        System.out.println("Please choose one of the options");
        System.out.println("1. Deposit");
        System.out.println("2. Cash out");
        System.out.println("3. Show balance");
        System.out.println("4. Quit");
    }

    public void interfaceLoop() {
        int numberOption;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                showOptions();
                numberOption = scannerOptions(scanner);
                try {
                    switch (numberOption) {
                        case DEPOSIT:
                            //method_Deposit
                            break;
                        case CASH_OUT:
                            //method_Cash_Out
                            break;
                        case SHOW_BALANCE:
                            //method_Balance
                            break;
                        case QUIT:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            } while (numberOption != 4);
        }
    }

    private int scannerOptions(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please insert a number");
            showOptions();
            scanner.next();
            return scannerOptions(scanner);
        }
    }
}

