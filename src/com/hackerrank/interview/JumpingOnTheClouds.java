package com.hackerrank.interview;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

    public static void main(String[] args) {

        String url = "https://www.hackerrank.com/challenges/jumping-on-the-clouds";

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);

        jumpingOnClouds(list);
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        int jumps = 0;
        int i = 0;
        int n = c.size();

        while (i < n - 1) {
            if (i + 2 < n && c.get(i + 2) == 0) {
                // Jumping two clouds ahead is safe
                i += 2;
            } else {
                // Jumping one cloud ahead is safe
                i += 1;
            }
            jumps++;
        }

        return jumps;
    }

    public static int jumpingOnClouds2(List<Integer> c) {
        // Write your code here

        int size = c.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (c.get(i) != 1) {
                count++;
            }
        }
        return count;
    }
}
