package com.krotos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Search
        Integer[] tabInt = {123, 4, 2, 235, 5, 23, 3, 6, 45, 7};
        SearchAlgorithm find = new LinearSearch();
        System.out.println("Search: " + find.search(2, tabInt));

        System.out.println(middleIndex(tabInt));
        Integer[] tabA = printToIndA(3, tabInt);
        System.out.println("tab a: " + Arrays.toString(tabA));
        printFromIndB(7, tabInt);

        Integer[] sortedIntTab = {1, 3, 4, 6, 7, 8, 9, 12};
        Integer[] difSortedTab = {8, 7, 5, 4, 3, 2, 0};
        SearchAlgorithm findB = new BinarySearch();
        System.out.println("Binary search 1: " + findB.search(9, sortedIntTab));

        System.out.println("Binary search 2: " + findB.search(7, difSortedTab));

        Person[] tabPer = new Person[7];
        tabPer[0] = new Person("Adam", "Nowak", 12);
        tabPer[1] = new Person("Pawel", "Nowyumysrak", 13);
        tabPer[2] = new Person("asda", "myumy", 15);
        tabPer[3] = new Person("dgdf", "sdrgs", 13);
        tabPer[4] = new Person("rhthrth", "Nosrgsdrwak", 22);
        tabPer[5] = new Person("hrwe", "sgraraae", 33);
        tabPer[6] = new Person("myyumy", "Nowsefseak", 44);
        findPersonByAge(15, tabPer);
        findPerson("dgdf", 13, tabPer);

        //Sort
        int[] tabInt2 = {12, 22, 13, 14, 55, 16};
        Wstep wstep = new Wstep();
        wstep.zamiana(tabInt2, 1, 2);
        System.out.println("Tab: " + Arrays.toString(tabInt2));
        wstep.wypiszZIndeksem(tabInt2);
        wstep.wypiszJakKwadrat(tabInt2);
        System.out.println("Z zamianą: ");
        wstep.wypiszJakWyzejZZamiana(tabInt2);

        System.out.println("Bubble sort ");
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(tabInt)));

        System.out.println("Bubel 2");
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        bubbleSort2.dispTest(tabInt2);
        Integer[] tabInt3 = {123, 4, 2, 235, 5, 23, 3, 6, 45, 7};
        System.out.println("Bubel 2 sort: " + Arrays.toString(bubbleSort2.sort(tabInt3)));

        System.out.println("Selection sort");
        SelectionSort selectionSort = new SelectionSort();
        Integer[] tabInt4 = {123, 4, 2, 235, 5, 23, 3};
        System.out.println(Arrays.toString(tabInt4));
        System.out.println("min:" + selectionSort.findMin(tabInt4));
        selectionSort.findMinBetween(tabInt4, 3, 5);
        System.out.println("Selection sort: " + Arrays.toString(selectionSort.sort(tabInt4)));

        System.out.println("Merge sort");
        MergeSort mergeSort = new MergeSort();
        Integer[] tabInt5 = {123, 4, 2, 235, 5, 23, 3, 6, 6, 6, 6};
        mergeSort.divideTab(tabInt5);
        System.out.println("tab3: " + Arrays.toString(tabInt3));
        System.out.println("tab4: " + Arrays.toString(tabInt4));
        mergeSort.mergeSortedTabs(tabInt3, tabInt4);
        System.out.println("tab5: " + Arrays.toString(tabInt5));
        System.out.println("Merge sort: " + Arrays.toString(mergeSort.sort(tabInt5.clone())));

        System.out.println("Wstep 2");
        Wstep2 wstep2 = new Wstep2();
        System.out.println("zad1: "+wstep2.removeDuplicateAndSort(Arrays.asList(tabInt5.clone())));
        System.out.println("zad2: ");
        wstep2.sortCars();
        wstep2.zad3();

        System.out.println("Wstep 3");
        System.out.println("tab: "+ Arrays.toString(tabInt5));
        Wstep3 wstep3=new Wstep3();
        wstep3.findMid(tabInt5);
        wstep3.randomEl(tabInt5);
        System.out.println("zad 3: "+ Arrays.toString(wstep3.lowerTab(tabInt5.clone())));
        System.out.println("zad 4: "+ Arrays.toString(wstep3.higherTab(tabInt5.clone())));

    }

    static private int middleIndex(Integer[] tab) {
        return tab.length / 2;
    }

    static private Integer[] printToIndA(int a, Integer[] tab) {

        List<Integer> tempList = new ArrayList<>();
        System.out.println("to a");
        for (int i = 0; i <= a; i++) {
            System.out.println(tab[i]);
            tempList.add(tab[i]);
        }
        Integer[] tab2 = new Integer[tempList.size()];
        tab2 = tempList.toArray(tab2);
        return tab2;
    }

    static private void printFromIndB(int b, Integer[] tab) {
        System.out.println("from b");
        for (int i = b; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    static private void findPersonByAge(int val, Person[] tabP) {
        SearchAlgorithm findL = new LinearSearch();
        SearchAlgorithm findB = new BinarySearch();
        Integer[] tabInt = new Integer[tabP.length];
        for (int i = 0; i < tabP.length; i++) {
            tabInt[i] = tabP[i].age;
        }
        int index = findL.search(val, tabInt);
        System.out.println(tabP[index]);
    }

    static private void findPerson(String name, int val, Person[] tabP) {
        System.out.println("find pers");
        SearchAlgorithm findL = new LinearSearch();
        Integer[] tabInt = new Integer[tabP.length];
        int index = 0;
        for (int i = 0; i < tabP.length; i++) {
            tabInt[i] = tabP[i].age;
        }
        while (!tabP[index].name.equals(name)) {
            index = findL.search(val, tabInt);
            tabInt[index] = -1;
        }
        System.out.println(tabP[index]);
    }

}
