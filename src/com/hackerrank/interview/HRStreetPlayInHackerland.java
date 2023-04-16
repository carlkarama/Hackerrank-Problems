package com.hackerrank.interview;

import java.util.List;

public class HRStreetPlayInHackerland {

    public static void main(String[] args) {

    }

    /*
     * Complete the 'getWhiteLightLength' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. 2D_INTEGER_ARRAY lights
     */

    public static int getWhiteLightLength(int n, int m, List<List<Integer>> lights) {
        // Write your code here

        int[] lightStage = new int[n];

        for(int i = 0; i < m; i++) {
            int color = lights.get(i).get(0);
            int left = lights.get(i).get(1);
            int right = lights.get(i).get(2);

            for(int j = left-1; j < right; j++) {
                lightStage[j] |= (1 << (color-1));
            }
        }

        int whiteIlluminatedPositions = 0;

        for(int i = 0; i < n; i++) {
            if(lightStage[i] == 7) {
                whiteIlluminatedPositions++;
            }
        }
        return whiteIlluminatedPositions;
    }
}
