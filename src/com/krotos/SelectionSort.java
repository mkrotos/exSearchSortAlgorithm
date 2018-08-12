package com.krotos;

import java.util.List;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        return new Integer[0];
    }

    public int findMin(Integer[] tab){
        int min=tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]<min){
                min=tab[i];
            }
        }
        return min;
    }

    public int findMinBetween(Integer[] tab, int a, int b){
        int min=tab[a];
        int ind=a;
        for(int i=a;i<b;i++){
            if(tab[i]<min){
                min=tab[i];
                ind=i;
            }
        }
        System.out.println("index: "+ind+", min between: "+min);
        return min;
    }
}
