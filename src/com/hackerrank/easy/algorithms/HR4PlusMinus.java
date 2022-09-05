package com.hackerrank.easy.algorithms;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


/** @author Carl Karama */

public class HR4PlusMinus {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add( -3);
        list.add(4);
        list.add(-5);
        fraction(list);
    }

    public static void fraction(List<Integer> arr) {
        int total = arr.size();

        NumberFormat numberFormat = new DecimalFormat("#.######");

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                positiveCount++;
            }
            if (integer < 0) {
                negativeCount++;
            }
            if (integer == 0) {
                zeroCount++;
            }
        }


        double positiveRatio = (double) positiveCount / total;
        System.out.println(numberFormat.format(positiveRatio));

        double negativeRatio = (double) negativeCount / total;
        System.out.println(numberFormat.format(negativeRatio));

        double zeroRatio = (double) zeroCount / total;
        System.out.println(numberFormat.format(zeroRatio));
    }
}
