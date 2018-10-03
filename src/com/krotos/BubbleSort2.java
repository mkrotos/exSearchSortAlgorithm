package com.krotos;

import java.util.List;

public class BubbleSort2 implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - (i + 1); j++) {
                if (input[j] > input[j + 1]) {
                    switchWithNextValue(input, j);
                }
            }
        }
        return input;
    }

    private void switchWithNextValue(Integer[] input, int j) {
        int temp = input[j];
        input[j] = input[j + 1];
        input[j + 1] = temp;
    }

    public void dispTest(int[] tab) {
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - j; i++) {
                System.out.print(i + ": " + tab[i] + " | ");
            }
            System.out.println();
        }
    }
}
