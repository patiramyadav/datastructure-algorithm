package org.patiram.facebook;
/*
Pair Sums
        Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements within it which sum to k.
        If an integer appears in the list multiple times, each copy is considered to be different; that is, two pairs are considered different if one pair includes at least one array index which the other doesn't, even if they include the same values.
        Signature
        int numberOfWays(int[] arr, int k)
        Input
        n is in the range [1, 100,000].
        Each value arr[i] is in the range [1, 1,000,000,000].
        k is in the range [1, 1,000,000,000].
        Output
        Return the number of different pairs of elements which sum to k.
        Example 1
        n = 5
        k = 6
        arr = [1, 2, 3, 4, 3]
        output = 2
        The valid pairs are 2+4 and 3+3.
        Example 2
        n = 5
        k = 6
        arr = [1, 5, 3, 3, 3]
        output = 4
        There's one valid pair 1+5, and three different valid pairs 3+3 (the 3rd and 4th elements, 3rd and 5th elements, and 4th and 5th elements).
*/

import java.util.HashMap;
import java.util.Map;

public class PairSums {
// Add any helper functions you may need here

    int combination(int n){
        return (n*n -n)/2;
    }


    int numberOfWays(int[] arr, int k) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        count += combination(freq.getOrDefault(k/2, 0));

        for(int i =0; i<arr.length; i++){
            if(k/2 == arr[i]){
                continue;
            }else if(arr[i]>k){
                continue;
            }else{
                int freqC = freq.get(arr[i]);
                int freqP = freq.getOrDefault(k-arr[i], 0);
                int min = Math.min(freqC, freqP);
                count += min;
                freq.put(arr[i], freqC-min);
                if(freq.containsKey(k-arr[i])){
                    freq.put(k-arr[i], freqP-min);
                }
            }
        }
        return count;
    }
}
