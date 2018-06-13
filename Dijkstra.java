package com.hackercode.utility;

public class Dijkstra {

    public static void dij(int[][] graph,int src, int[] visited){
        int n = 5;
        int inf = 999;
        //int src;
        int[] distance = new int[5];
        //int[] sptset = new int[5];
        //int[] visited = new int[5];
        int v = 0;
        //src = scan.nextInt();
        distance= graph[src];
        visited[src] = 1;
        distance[src] = 0;
        for (int i = 0; i < n; i++) {
            inf = 999;
            for (int j = 0; j < n; j++) {
                if ((inf > distance[j] )&& visited[j] != 1) {
                    inf = distance[j];
                    v = j;
                }
            }
            visited[v] = 1;
            for (int j = 0; j < n; j++) {
                if ((inf + graph[j][v] < distance[j] )&& visited[j]!= 1) {
                    distance[j] = inf + graph[j][v];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
                    System.out.print(" " + distance[i]);
        }
        System.out.println();
    }
}
