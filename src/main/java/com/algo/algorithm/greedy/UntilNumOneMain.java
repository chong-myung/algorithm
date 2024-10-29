package com.algo.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UntilNumOneMain {

     public static void implement() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());

         /**
          * 1이 될 때까지 나누는 경우는
          * 1에 1을 더하거나 K 를 곱했을 때 n에 도달한 경우를 생각해 볼 수 있다.
          * 2 <= n,k <= 100_000
          * */
         int count = 0;
         int namuzi = 0;
         while(true){
             namuzi = n%m;
             count += namuzi;
             n = n-namuzi;
             if(n < m) break;
             count += 1;
             n = n/m;
         }
         count += (n-1);
         System.out.println(count);

     }
     public static void main(String[] args) throws IOException {
         implement();
     }
}
