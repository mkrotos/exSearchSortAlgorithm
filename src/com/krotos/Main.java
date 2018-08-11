package com.krotos;

public class Main {

    public static void main(String[] args) {

        Integer[] tabInt={123,4,2,235,5,23,2,3,2,4,235,23,5,235,25,55,5,11,6,45,7,4};
        SearchAlgorithm find=new LinearSearch();
        System.out.println("Search: "+ find.search(29,tabInt));
    }
}
