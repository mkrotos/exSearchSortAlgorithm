package com.krotos;

import java.util.List;

public class BinarySearch implements SearchAlgorithm {

    private static final String ASCENDING = "Ascending";
    private static final String DESCENDING = "Descending";

    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        if (input[0] < input[1]) {
            System.out.println(ASCENDING);
            System.out.println("Iter: " + binarySearchAscendIter(input, value));
            return binarySearchAscendRec(input, value, 0, input.length - 1);
        } else {
            System.out.println(DESCENDING);
            return binarySearchDescendRec(input, value, 0, input.length - 1);
        }

    }


    private int binarySearchAscendRec(Integer[] tab, int value, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (tab[mid] > value) {
            return binarySearchAscendRec(tab, value, low, mid - 1);
        } else if (tab[mid] < value) {
            return binarySearchAscendRec(tab, value, mid + 1, high);
        } else {
            return mid;
        }
    }

    private int binarySearchDescendRec(Integer[] tab, int value, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        //System.out.println("mid:"+mid);
        if (tab[mid] < value) {
            return binarySearchDescendRec(tab, value, low, mid - 1);
        } else if (tab[mid] > value) {
            return binarySearchDescendRec(tab, value, mid + 1, high);
        } else {
            return mid;
        }
    }

    private int binarySearchAscendIter(Integer[] tab, int value) {
        int low = 0;
        int high = tab.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (tab[mid] > value) {
                high = mid - 1;
            } else if (tab[mid] < value) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
