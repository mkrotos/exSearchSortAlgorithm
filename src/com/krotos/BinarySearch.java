package com.krotos;

import java.util.List;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        return binarySearchRec(input, value, 0, input.length - 1);

    }


    private int binarySearchRec(Integer[] tab, int value, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (tab[mid] > value) {
            return binarySearchRec(tab, value, low, mid - 1);
        } else if (tab[mid] < value) {
            return binarySearchRec(tab, value, mid + 1, high);
        } else {
            return mid;
        }
    }
}
