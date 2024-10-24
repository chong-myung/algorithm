package com.algo.algorithm.greedy;

import java.util.Arrays;
import java.util.List;

public class ChangeMain {

    private static final List<Integer> list = Arrays.asList(500,100,50,10);
    public static void main(String[] args) {
        // 500,100,50,10 동전의 이후 값들이 배수여서 그리디 적용 가능
        int n = 1_260;
        int count = 0 ;

        for (Integer integer : list) {
            count += n / integer;
            n = n % integer;
        }
        System.out.println(count);
    }

}
