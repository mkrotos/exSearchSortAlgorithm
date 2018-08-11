package com.krotos;

public class Main {

    public static void main(String[] args) {

        Integer[] tabInt={123,4,2,235,5,23,2,3,2,6,45,7,4};
        SearchAlgorithm find=new LinearSearch();
        System.out.println("Search: "+ find.search(2,tabInt));

        System.out.println( middleIndex(tabInt));
        printToIndA(3,tabInt);
        printFromIndB(7,tabInt);
    }

     static private int middleIndex(Integer[] tab){
        return  tab.length/2;
    }

    static private void printToIndA(int a, Integer[] tab){
        System.out.println("to a");
        for(int i=0;i<=a;i++){
            System.out.println(tab[i]);
        }
    }
    static private void printFromIndB(int b, Integer[]  tab){
        System.out.println("from b");
        for(int i=b;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
