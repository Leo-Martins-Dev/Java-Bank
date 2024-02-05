package org.javabank.userinterface;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {
    Scanner scanner = new Scanner(System.in);

    public void showOptions(){
        System.out.println("Please choose one of the options");
        System.out.println("1. Deposit");
        System.out.println("2. Cash out");
        System.out.println("3. Show balance");
        System.out.println("4. Quit");
    }

    public int scannerOptions(){
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please insert a number");
            scanner.next();
            return scannerOptions();
        }
    }
}
