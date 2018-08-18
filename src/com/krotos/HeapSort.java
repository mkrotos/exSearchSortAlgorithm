package com.krotos;

import java.util.List;

public class HeapSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i;
            int k = getFatherInd(j);
            int x = input[i];
            while (k >= 0 && input[k] < x) {
                int temp = input[j];
                input[j] = input[k];
                input[k] = temp;
                j = k;
                k = getFatherInd(j);
            }
            input[j] = x;
        }
        return input;
    }

    private int getFatherInd(int index) {
        if (index > 0) {
            return ((index - 1) / 2);
        } else {
            return -1;
        }
    }
}
