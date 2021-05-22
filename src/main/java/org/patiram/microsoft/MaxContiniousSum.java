package org.patiram.microsoft;

import java.util.Arrays;
import java.util.List;

public class MaxContiniousSum {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, -3, 4, -6, 9, -12, 4, 8, 5, 3,5, 3, -19, 4, 5, 6,3 ,8);
        int max = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;
        for(Integer i: input){
            if(i>current && current < 0){
                current = i;
            }else{
                current += i;
            }
            if(current>max){
                max = current;
            }
        }
        System.out.println(max);
    }
}
