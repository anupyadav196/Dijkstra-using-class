package com.hackercode.Driver;
import com.hackercode.utility.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;

import java.util.Vector;
public class Driver {

    public static void main(String[] args) {
  /*      int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("addition is " + Operation.add(a, b));
        System.out.println("subtraction is " + Operation.sub(a, b));
        System.out.println("multiplication is " + Operation.mul(a, b));
        System.out.println("division is " + Operation.div(a, b));
        int arr[] = {34, 35, 67, 23, 45, 46};
        Selectionsort obj = new Selectionsort();
        obj.sort(arr);
*/

        //array list exam
     /*
        int n = 10;
        ArrayList<Integer> arrli = new ArrayList<Integer>(10);
        for (int i = 0; i < n; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);
        for (int i = 0; i < n; i++) {
            System.out.println(arrli.get(i) + "");
        }
        int arr []= new int[10];
        Vector<Integer> v = new Vector();
        Hashtable<Integer , String > h= new Hashtable
        arr[0]=10;
        Integer obj;
        v.addElement( obj: 10);
        h.put(12,"Hackercode");
        arrli.add(10);
*/


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

