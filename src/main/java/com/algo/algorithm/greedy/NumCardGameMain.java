package com.algo.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumCardGameMain {

    public static void implement() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i,j;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        int rowMin = 10_001;
        int totalMax = 0;
        for(i =0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(j = 0 ; j < m ;j++){
                int a = Integer.parseInt(st.nextToken());
                if(a < rowMin ) rowMin = a;
            }
            if(rowMin > totalMax) totalMax = rowMin;
            rowMin = 10_001;
        }

        System.out.println(totalMax);
    }

    public static void main(String[] args) throws IOException {
        implement();
    }
}
