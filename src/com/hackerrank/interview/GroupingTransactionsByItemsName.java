package com.hackerrank.interview;

import java.util.*;

public class GroupingTransactionsByItemsName {

    public static void main(String[] args) {

    }
    public static List<String> groupTransactions(List<String> transactions) {
        Map<String, Integer> itemNameCount = new HashMap<>();

        for (int i = 0; i < transactions.size(); i++) {
            String transaction = transactions.get(i);
            itemNameCount.put(transaction, itemNameCount.getOrDefault(transaction, 0) + 1);
        }

        List<String> sortedItems = new ArrayList<>(itemNameCount.keySet());

        Collections.sort(sortedItems, (a, b) -> {
            int cmp = itemNameCount.get(b) - itemNameCount.get(a);
            return cmp == 0 ? a.compareTo(b) : cmp;
        });

        List<String> result = new ArrayList<>();

        for (String item : sortedItems) {
            result.add(item + " " + itemNameCount.get(item));
        }
        return result;
    }
}
