package org.javabank;
import java.util.Scanner;

public class Options {
    public void showOptions(){
        System.out.println("Please choose one of the options");
        System.out.println("1. Deposit");
        System.out.println("2. Cash out");
        System.out.println("3. Show balance");
        System.out.println("4. Quit");
    }

    public int scannerOptions(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

