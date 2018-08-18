package com.krotos;

import java.util.List;

public class QuickSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        return quickSort(input,0,input.length-1);
    }

    private Integer[] quickSort(Integer[] A, int left, int right){
        int mid=(left+right)/2;
        int j=left;
        int pivot=A[mid];
        A[mid]=A[right];
        for(int i=left;i<right;i++){
            if(A[i]<pivot){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j++;
            }
        }
        A[right]=A[j];
        A[j]=pivot;
        if(left<j-1){
            quickSort(A,left,j-1);
        }
        if(j+1<right){
            quickSort(A,j+1,right);
        }
        return A;
    }
}

