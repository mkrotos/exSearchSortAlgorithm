package com.krotos;

import java.util.List;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        if(input[0]<input[1]) {
            System.out.println("Asc");
            return binarySearchAscendRec(input, value, 0, input.length - 1);
        }else {
            System.out.println("Desc");
            return binarySearchDescendRec(input,value,0,input.length-1);
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
}
