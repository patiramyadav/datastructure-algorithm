package org.patiram.random;

/**
 * Find the maximum subarray XOR in a given array
 * Difficulty Level : Expert
 * Last Updated : 13 Apr, 2021
 * Given an array of integers. find the maximum XOR subarray value in given array. Expected time complexity O(n).
 *
 * Examples:
 *
 * Input: arr[] = {1, 2, 3, 4}
 * Output: 7
 * The subarray {3, 4} has maximum XOR value
 *
 * Input: arr[] = {8, 1, 2, 12, 7, 6}
 * Output: 15
 * The subarray {1, 2, 12} has maximum XOR value
 *
 * Input: arr[] = {4, 6}
 * Output: 6
 * The subarray {6} has maximum XOR value
 */


public class MaxSubarrayXor {
    public static void main(String[] args) {
        int result = BruteForceWay.maxSubarrayXOR(4, new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}

/**
 * Runtime O(n^2)
 * Memory O(1)
 */
class BruteForceWay{
    static int maxSubarrayXOR(int N, int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int subMax = 0;
            for(int j=i; j<arr.length; j++){
                subMax = subMax^arr[j];
            }
            max = Math.max(max, subMax);
        }
        return max;
    }
}

class Trie{

}

