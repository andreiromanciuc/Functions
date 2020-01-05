package org.fasttrackit;

import java.util.Scanner;

public class PasswordStrengthIndicator {


    public void calculatorStrengthIndicator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your password");
        String word = scanner.nextLine();

        int iPasswordScore = 0;
        if (word.length() < 8)
            System.out.println("Introduce more than 8 characters");
        else if (word.length() >= 10)
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        if (word.matches("(?=.*[0-9]).*"))
            iPasswordScore += 2;

        if (word.matches("(?=.*[a-z]).*"))
            iPasswordScore += 2;

        if (word.matches("(?=.*[A-Z]).*"))
            iPasswordScore += 2;

        if (word.matches("(?=.*[~!@#$%^&*()_-]).*"))
            iPasswordScore += 2;

        if (iPasswordScore == 10)
            System.out.println("Your password is strength");
        else if (6 <= iPasswordScore)
            System.out.println("Your password have normal strength");
        else
            System.out.println("Your password is weak");
    }

}
