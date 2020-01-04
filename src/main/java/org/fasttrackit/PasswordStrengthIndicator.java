package org.fasttrackit;

import java.util.Arrays;

public class PasswordStrengthIndicator {

    private static int strengthIndicator(String word) {

            int iPasswordScore = 0;

            if( word.length() < 8 )
                return 0;
            else if( word.length() >= 10 )
                iPasswordScore += 2;
            else
                iPasswordScore += 1;


            if( word.matches("(?=.*[0-9]).*") )
                iPasswordScore += 2;

            if( word.matches("(?=.*[a-z]).*") )
                iPasswordScore += 2;


            if( word.matches("(?=.*[A-Z]).*") )
                iPasswordScore += 2;


            if( word.matches("(?=.*[~!@#$%^&*()_-]).*") )
                iPasswordScore += 2;

            return iPasswordScore;

    }
}
