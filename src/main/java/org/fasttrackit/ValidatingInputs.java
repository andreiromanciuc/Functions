package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidatingInputs {

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);



    public void validating() {
        System.out.print("Insert first name: ");
        if (firstName()) {
            System.out.print("Insert second name: ");
            if (secondName()) {
                System.out.print("Enter zip code: ");
                if (zipCode()) {
                    System.out.print("Enter your ID: ");
                    if (id()) {
                        System.out.print("There were no errors found.");
                    } else {
                        validating();
                    }
                } else {
                    validating();
                }
            } else {
                validating();
            }
        } else {
            validating();
        }
    }

    public boolean firstName() {
        String name = scanner.nextLine();

        if (name.length() < 2) {
            System.out.println(name + " is not a valid name. It's too short");
            return false;
        } else if (name.matches("(.*)[0-9](.*)")) {
            System.out.println("Please enter a valid name");
            return false;
        }
        return true;
    }

    public boolean secondName() {
        String secondName = scanner1.nextLine();

        if (secondName.length() < 2) {
            System.out.println(secondName + " is not a valid name. It's too short");
            return false;
        } else if (secondName.matches("(.*)[0-9](.*)")) {
            System.out.println("Please enter a valid name");
            return false;
        }
        return true;
    }

    public boolean zipCode() {
        try {int code = scanner2.nextInt();

            int code2 = String.valueOf(code).length();

            if (code2 != 5) {
                System.out.println("Please enter a valid zip code");
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid zip code");
            return false;
        }
        return true;
    }

    public boolean id() {

        String id = scanner3.nextLine();
        boolean idFinal = id.matches("\\b[A-Z][A-Z]\\b"+"-"+"\\b[1-9][1-9][1-9]\\b");
        if (!idFinal) {
            System.out.println("Please enter an valid ID");
            return false;
        }
        return true;
    }

}
