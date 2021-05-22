package org.patiram.random;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};

        List<Integer> result = new ArrayList<>();

        int size = arr.length*arr[0].length;

        int left = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;
        int top = 0;

        while(result.size()<=size){

            for(int i = 0; i<= right; i++){
                result.add(arr[top][i]);
            }
            top++;
            System.out.println(result.toString());
            for(int i = top; i<= bottom; i++){
                result.add(arr[i][right]);
            }
            right--;
            System.out.println(result.toString());
            for(int i = right; i >= left; i--){
                result.add(arr[bottom][i]);
            }
            bottom--;
            System.out.println(result.toString());
            for(int i = bottom; i >=  top; i--){
                result.add(arr[i][left]);
            }
            left++;
            System.out.println(result.toString());
        }
        System.out.println(result.toString());
    }
}
