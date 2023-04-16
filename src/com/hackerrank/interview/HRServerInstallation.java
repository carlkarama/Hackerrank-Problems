package com.hackerrank.interview;

import java.util.*;

public class HRServerInstallation {

    public static void main(String[] args) {

    }

    public static int findCentralNode(int treeNodes, List<Integer> treeFrom, List<Integer> treeTo, List<Integer> treeWeight, int x, int y, int z) {
        // Create an adjacency list to represent the tree
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < treeFrom.size(); i++) {
            int u = treeFrom.get(i);
            int v = treeTo.get(i);
            int w = treeWeight.get(i);
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
        }

        // Calculate the distance between each node and the nodes X and Z
        int[] distX = new int[treeNodes + 1];
        int[] distZ = new int[treeNodes + 1];
        dfs(x, -1, 0, adj, distX);
        dfs(z, -1, 0, adj, distZ);

        // Traverse through each node and calculate the value of Time(C, X) + Time(C, Z)
        int minTime = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 1; i <= treeNodes; i++) {
            int currTime = distX[i] + distZ[i];
            if (currTime < minTime) {
                minTime = currTime;
                ans = i;
            }
        }
        return ans;
    }

    private static void dfs(int u, int parent, int dist, Map<Integer, List<int[]>> adj, int[] distArr) {
        distArr[u] = dist;
        for (int[] edge : adj.get(u)) {
            int v = edge[0];
            int w = edge[1];
            if (v != parent) {
                dfs(v, u, dist + w, adj, distArr);
            }
        }
    }



}
