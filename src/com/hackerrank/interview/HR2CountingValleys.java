package com.hackerrank.interview;

public class HR2CountingValleys {

    public static void main(String[] args) {

        System.out.println(countingValleys(8, "DDUUUUDD"));
    }

    public static int countingValleys(int steps, String path) {

        int level = 0; // keeps track of the current altitude
        int valleys = 0; // count the valleys walked through
        boolean inValley = false; // true means he's in the valley

        for(int i = 0; i < steps; i++) {
            if (path.toCharArray()[i] == 'U') {
                level++; // step up

                // at every loop check if hiker is at sea level
                if (level == 0 && inValley) {
                    valleys++;
                    inValley = false;
                }
            } else if (path.toCharArray()[i] == 'D') {
                level--; // step down

                if ((level < 0) && (!inValley)) {
                    inValley = true;
                }
            }
        }
        return valleys;
    }
}
