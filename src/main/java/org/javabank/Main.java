package org.javabank;

import org.javabank.userinterface.Options;

public class Main {
    public static void main(String[] args) {
        Options options = new Options();
        int numberOption;
        do {
            options.showOptions();
            numberOption = options.scannerOptions();
            try {
                switch (numberOption) {
                    case 1:
                        //options.deposit();
                        break;
                    case 2:
                        //options.cashOut();
                        break;
                    case 3:
                        //options.showBalance();
                        break;
                    case 4:
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
