package com.hackerrank.easy.datastructures;

import java.util.Arrays;

public class HR1ReverseArray {

    public static void main(String[] args) {

        String[] strings = {"clubs", "diamonds", "hearts", "spades"};

        int[] indexes = {1,2,3,4,5};

        System.out.println((Arrays.toString(revereseArrayGeneric(strings))));
        System.out.println(revereseArray(indexes));
    }


   //Generic implementation
   public static <T> T[] revereseArrayGeneric(T[] t) {

        int counter = 0, size = t.length;

        Object[] objects = new Object[size];


        for (int i = size-1; i >= 0; i--) {
            objects[counter] = t[i];
            counter++;
        }
        return (T[]) objects;
    }

    // Classic implementation
    public static int[] reverseArray(int[] a) {

        int counter = 0;
        int size = a.length;
        int[] b = new int[size];

        for (int i = size-1; i >= 0; i--) {
            a[counter] = a[i];
            counter++;
        }
        a = b;
        return a;
    }
}