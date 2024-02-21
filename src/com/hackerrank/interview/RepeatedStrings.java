package com.hackerrank.interview;

import java.util.ArrayList;

public class RepeatedStrings {

    public static void main(String[] args) {

        String url = "https://www.hackerrank.com/challenges/repeated-string/";

        repeatedString("aba", 10);
    }

    public static long repeatedString(String s, long n) {

        char[] characters = s.toCharArray();
        int numberOfIterations = (int) n-characters.length;
        char[] tempValues = new char[numberOfIterations];

        ArrayList<Character> terms = new ArrayList<>();

        /**
         * 1. Turn the string into a char[]
         * 2. Get the number of times the loop has to run
         * 2. Clone the char[] and store each character in a temp[]
         * 4. 
         */
        for (int i = 0; i < numberOfIterations; i++) {
            //terms.add(i, );
        }
        return n;
    }
}
