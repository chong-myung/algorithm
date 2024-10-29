package com.algo.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UDRLMain {

    public static void implement() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] plans = br.readLine().split(" ");
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        String[] moves = {"L","R","U","D"};

        int x = 1,y = 1;
        int nx = 0 , ny = 0;
        for (String plan : plans) {
            for (int j = 0; j < moves.length; j++) {
                if (plan.equals(moves[j])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x+ " " + y);

    }

    public static void main(String[] args) throws IOException {
        implement();
    }
}
