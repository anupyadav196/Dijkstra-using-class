package com.hackercode.Driver;
import com.hackercode.utility.*;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
        int n = 5;
        int inf = 999;
        //int src;
       // int[] distance = new int[5];
       // int[] sptset = new int[5];
        int[] visited = new int[5];
        int v = 0;
        Scanner scan = new Scanner(System.in);
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
           // sptset[i]=0;
            visited[i]=0;
            for (int j = 0; j < n; j++) {
                graph[i][j] = scan.nextInt();
                if (graph[i][j] <= 0) {
                    graph[i][j] = inf;
                }
            }
        }
        for(int i=0;i<5;i++){
            visited=new int[]{0,0,0,0,0};
            Dijkstra.dij(graph,i,visited);
        }
    }
}

