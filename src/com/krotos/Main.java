package com.krotos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] tabInt={123,4,2,235,5,23,3,6,45,7};
        SearchAlgorithm find=new LinearSearch();
        System.out.println("Search: "+ find.search(2,tabInt));

        System.out.println( middleIndex(tabInt));
        Integer[] tabA= printToIndA(3,tabInt);
        System.out.println("tab a: "+ Arrays.toString(tabA));
        printFromIndB(7,tabInt);

        Integer[] sortedIntTab={1,3,4,6,7,8,9,12};
        Integer[] difSortedTab={8,7,5,4,3,2,0};
        SearchAlgorithm findB=new BinarySearch();
        System.out.println("Binary search 1: "+ findB.search(9,sortedIntTab));

        System.out.println("Binary search 2: "+ findB.search(7,difSortedTab));
    }

     static private int middleIndex(Integer[] tab){
        return  tab.length/2;
    }

    static private Integer[] printToIndA(int a, Integer[] tab){

        List<Integer> tempList=new ArrayList<>();
        System.out.println("to a");
        for(int i=0;i<=a;i++){
            System.out.println(tab[i]);
            tempList.add(tab[i]);
        }
        Integer[]  tab2=new Integer[tempList.size()];
        tab2= tempList.toArray(tab2);
        return tab2;
    }
    static private void printFromIndB(int b, Integer[]  tab){
        System.out.println("from b");
        for(int i=b;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
