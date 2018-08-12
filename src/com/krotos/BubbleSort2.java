package com.krotos;

import java.util.List;

public class BubbleSort2 implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        return new Integer[0];
    }

    public void dispTest(int[] tab){
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length-j; i++) {
                System.out.print(i + ": " + tab[i] + " | ");
            }
            System.out.println();
        }
    }
}
