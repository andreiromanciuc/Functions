package org.fasttrackit;

import java.util.Arrays;

public class AnagramChecker {

    private boolean areAnagram(char[] firstWord, char[] secondWord) {
        int first = firstWord.length;
        int second = secondWord.length;

        if (first!= second)
            return false;

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        for (int i=0; i<first; i++)
            if (firstWord[i] != secondWord[i])
                return false;

        return true;
    }

}
//    public static void main(String args[])
//    {
//        char firstWord[] = ("geeksforgeeks").toCharArray();
//        char secondWord[] = ("forgeeksgeeks").toCharArray();
//
//        if (areAnagram(str1, str2))
//            System.out.println("The two strings are"
//                    + "anagram of each other");
//        else
//            System.out.println("The two strings are not"
//                    + " anagram of each other");
//    }
//}