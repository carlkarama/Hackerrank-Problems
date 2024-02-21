package com.hackerrank.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        // Example usage
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int rotations = 2;
        List<Integer> rotatedArray = rotLeft(array, rotations);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Calculate the actual number of rotations needed
        int rotations = d % a.size();

        // Create a new list to store the rotated array
        List<Integer> rotatedArray = new ArrayList<>(a.size());

        // Perform the rotation
        for (int i = rotations; i < a.size(); i++) {
            rotatedArray.add(a.get(i));
        }
        for (int i = 0; i < rotations; i++) {
            rotatedArray.add(a.get(i));
        }

        return rotatedArray;
    }
}
