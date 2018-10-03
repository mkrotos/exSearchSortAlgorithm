package com.krotos;

import java.util.List;

public class HeapSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        buildHeap(input);
        dismountHeap(input);
        return input;
    }

    private Integer[] dismountHeap(Integer[] input) {
        for (int i = input.length - 1; i > 0; i--) {
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            int fatherInd = 0;
            int sonInd = 1;
            while (sonInd < i) {
                int biggerSonInd = sonInd;
                if (sonInd + 1 < i && input[sonInd + 1] > input[sonInd]) {
                    biggerSonInd = sonInd + 1;
                }
                if (input[biggerSonInd] <= input[fatherInd]) {
                    break;
                }
                temp = input[fatherInd];
                input[fatherInd] = input[biggerSonInd];
                input[biggerSonInd] = temp;
                fatherInd = biggerSonInd;
                sonInd = 2 * fatherInd + 1;
            }
        }
        return input;
    }

    private Integer[] buildHeap(Integer[] input) {
        for (int i = 1; i < input.length; i++) {
            int actualInd = i;
            int fatherInd = getFatherInd(actualInd);
            int actualValue = input[i];
            while (fatherInd >= 0 && input[fatherInd] < actualValue) {
                int temp = input[actualInd];
                input[actualInd] = input[fatherInd];
                input[fatherInd] = temp;
                actualInd = fatherInd;
                fatherInd = getFatherInd(actualInd);
            }
            input[actualInd] = actualValue;
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
