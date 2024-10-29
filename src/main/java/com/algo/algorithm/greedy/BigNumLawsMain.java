package com.algo.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumLawsMain {

    public static void main(String[] args) throws IOException {
//        bad();
        good();
    }

    /**
     * 몫과 나머지를 이용해 처리 하면 더 빠르게 처리 가능
     * */
    public static void good() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        int i;
        int[] arr = new int[n];
        for(i = 0 ; i<n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max= arr[n-1];
        int nextMax = arr[n-2];

        int mok = m/(k+1);
        int namuzi = m%(k+1);
        result = (max*k + nextMax)*mok + max*namuzi;

        System.out.println(result);
    }

    public static void bad() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];

        int result = 0;
        int i;
        for(i = 0 ; i<n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        int nextMax = arr[n-2];

        while (true ) {
            for (i = 0; i < k; i++) {
                if(m == 0) break;
                result += max;
                m -= 1;
            }
            if(m == 0) break;
            result += nextMax;
            m -= 1;
        }
        System.out.println(result);
    }


}
