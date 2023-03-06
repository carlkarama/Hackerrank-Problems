package com.hackerrank.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/** @author Carl Karama */


public class HR1CompareTheTriplets {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(17);
        a.add(28);
        a.add(30);

        b.add(99);
        b.add(16);
        b.add(8);

        System.out.println((compareTheTriplets(a, b)));
    }

    public static List<Integer> compareTheTriplets(List<Integer> a, List<Integer> b) {

        ArrayList<Integer> tally = new ArrayList<>();

        int playerOne = 0, playerTwo = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                playerOne++;
            } else if(b.get(i) > a.get(i)) {
                playerTwo++;
            } else {
            }
        }

        tally.add(0, playerOne);
        tally.add(1, playerTwo);

        return tally;
    }
}
