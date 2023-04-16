package com.hackerrank.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HRKthSmallestTerm {
    public static void main(String[] args) {

    }

    /*
     * Complete the 'getkthSmallestTerm' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. LONG_INTEGER k
     */

    public static List<Integer> getkthSmallestTerm(List<Integer> arr, long k) {
        // Write your code here
        int n = arr.size();
        Collections.sort(arr);
        long lo = arr.get(0) * arr.get(0);
        long hi = arr.get(n-1) * arr.get(n-1);
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long count = 0;
            int j = n - 1;
            for (int i = 0; i < n; i++) {
                while (j >= 0 && arr.get(i) * arr.get(j) > mid) {
                    j--;
                }
                count += j + 1;
            }
            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (arr.get(i) * arr.get(j) <= lo) {
                k--;
                if (k == 0) {
                    return Arrays.asList(arr.get(i), arr.get(j));
                }
                i++;
            } else {
                j--;
            }
        }
        return Arrays.asList(-1, -1);
    }
}
