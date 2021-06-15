package org.patiram.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        for(int i: mergeSort.sortArray(new int[]{4, 2, 15, 2, 0, -1, 2})){
            System.out.print(i + ", ");
        }
    }
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }

    void sort(int[] nums, int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            sort(nums, l, m);
            sort(nums, m+1, r);
            // System.out.println(l + " " + r);
            merge(nums, l, m, r);
        }
    }

    void merge(int[] nums, int l, int m, int r){
        int n1 = m - l+1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = nums[l+i];
        }
        for(int i = 0; i<n2; i++){
            right[i] = nums[m+i+1];
        }

        int i=0, j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                nums[k] = left[i];
                i++;
            }else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}
