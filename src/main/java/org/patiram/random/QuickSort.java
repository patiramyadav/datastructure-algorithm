package org.patiram.random;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.doQuickSort(new int[]{5,3,10,6,3,7,}, 0, 5);
    }

    public void doQuickSort(int[] array, int lb, int ub){
        if(lb<ub){
            int pivot = partition(array, lb, ub);
            doQuickSort(array, lb, pivot-1);
            doQuickSort(array, pivot+1, ub);
            System.out.println(array.toString());
        }
    }

    public int partition(int[] array, int lb, int ub){
        int pivot = array[lb];
        int start = lb;
        int end = ub;
        while(array[start]<=pivot){
            start++;
        }
        while(end>=0 && array[end]>pivot){
            System.out.println(array[end]);
            end--;
        }
        if(array[start]<=array[end]){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
        }
        return end;
    }
}
