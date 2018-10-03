package com.krotos;

import java.util.Arrays;
import java.util.List;

public class MergeSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {

        return mergeSort(input, 0, input.length - 1);
    }

    public void divideTab(Integer[] tab) {
        int center = tab.length / 2;
        Integer[] tab1 = new Integer[center];
        Integer[] tab2 = new Integer[tab.length - center];
        for (int i = 0; i < center; i++) {
            tab1[i] = tab[i];
        }
        for (int i = center; i < tab.length; i++) {
            tab2[i - center] = tab[i];
        }
        System.out.println("tab1: " + Arrays.toString(tab1));
        System.out.println("tab2: " + Arrays.toString(tab2));

        //łączenie v1
        Integer[] tab3 = new Integer[tab1.length + tab2.length];
        int a = 0;
        for (int i = 0; i < Math.max(tab1.length, tab2.length); i++) {
            if (i < tab1.length) {
                tab3[a] = tab1[i];
                a++;
            }
            if (i < tab2.length) {
                tab3[a] = tab2[i];
                a++;
            }
        }
        System.out.println("Złączenie I: " + Arrays.toString(tab3));
    }

    public Integer[] mergeSortedTabs(Integer[] tab1, Integer[] tab2) {
        Integer[] mergedTab = new Integer[tab1.length + tab2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < mergedTab.length; i++) {
            if (a < tab1.length && b < tab2.length) {
                if (tab1[a] < tab2[b]) {
                    mergedTab[i] = tab1[a];
                    a++;
                } else {
                    mergedTab[i] = tab2[b];
                    b++;
                }
            } else if (a < tab1.length) {
                mergedTab[i] = tab1[a];
                a++;
            } else {
                mergedTab[i] = tab2[b];
                b++;
            }
        }
        System.out.println("Merged: " + Arrays.toString(mergedTab));
        return mergedTab;
    }

    private Integer[] mergeSort(Integer[] tab, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(tab, left, mid);
            mergeSort(tab, mid + 1, right);
            merge2(tab, left, mid, right);
        }
        return tab;
    }

    private Integer[] merge(Integer[] originalTab, int left, int mid, int right) {
        int i;
        int j;
        Integer[] tempTab = new Integer[originalTab.length];
        for (i = mid + 1; i > left; i--) {
            tempTab[i - 1] = originalTab[i - 1];
        }
        for (j = mid; j < right; j++) {
            tempTab[right + mid - j] = originalTab[j + 1];
        }
        for (int k = left; k <= right; k++) {
            if (tempTab[j] < tempTab[i]) {
                originalTab[k] = tempTab[j];
                j--;
            } else {
                originalTab[k] = tempTab[i];
                i++;
            }
        }
        return originalTab;
    }

    private Integer[] merge2(Integer[] originalTab, int left, int mid, int right) {
        Integer[] tempTab = new Integer[originalTab.length];
        int leftIndex = left;
        int rightIndex = mid + 1;
        for (int k = left; k <= right; k++) {
            if (leftIndex > mid || (rightIndex <= right && originalTab[rightIndex] < originalTab[leftIndex])) {
                tempTab[k] = originalTab[rightIndex];
                rightIndex++;
            } else {
                tempTab[k] = originalTab[leftIndex];
                leftIndex++;
            }
        }
        for (int k = left; k <= right; k++) {
            originalTab[k] = tempTab[k];
        }

        return originalTab;
    }
}

