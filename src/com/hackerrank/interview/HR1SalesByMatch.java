package com.hackerrank.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HR1SalesByMatch {

    public static void main(String[] args) {

        System.out.print(sockMerchant(9, List.of(1,2,3,4,4,3,2,1,1)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            // assign the current color at an index to color
            int color = ar.get(i);

            // updates the frequency of the count to a new value by +1 or default +1
            frequency.put(color, frequency.getOrDefault(color, 0) + 1);
        }

        int pairs = 0;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            // store the current frequency of each color
            int count = entry.getValue();

            // store the number of pairs
            pairs = pairs + count/2;

        }
        return pairs;
    }
}
