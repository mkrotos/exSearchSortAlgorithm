package com.krotos.cwiczenia;

import java.util.*;
import java.util.stream.Collectors;

public class Wstep3 {
    private int randEl;

    public int findMid(Integer[] tab){
        int mid=tab.length/2;
        int element=tab[mid];
        System.out.println("zad 1: "+element );
        return element;
    }
    public int randomEl(Integer[] tab){
        Random random=new Random();
        randEl=tab[random.nextInt(tab.length)];

        System.out.println("Zad 2: "+randEl );
        return randEl;
    }

    public Integer[] lowerTab(Integer[] tab){
        List<Integer> tempList=new ArrayList<>();
        tempList= Arrays.asList(tab).stream().filter(el->el<randEl).collect(Collectors.toList());
        Integer[] newTab=new Integer[tempList.size()];
        newTab=tempList.toArray(newTab);

        return newTab;
    }
    public Integer[] higherTab(Integer[] tab){
        List<Integer> tempList=new ArrayList<>();
        tempList= Arrays.asList(tab).stream().filter(el->el>randEl).collect(Collectors.toList());
        Integer[] newTab=new Integer[tempList.size()];
        newTab=tempList.toArray(newTab);

        return newTab;
    }

    public Integer[] nearlySort(Integer[] tab){
        int midIndex=tab.length/2;
        int midEl=tab[midIndex];

        List<Integer> lowerList=new ArrayList<>();
        List<Integer> midList=new ArrayList<>();
        List<Integer> higherList=new ArrayList<>();
        List<Integer> finalList=new ArrayList<>();

        midList=Arrays.asList(tab).stream().filter(el->el==midEl).collect(Collectors.toList());
        lowerList=Arrays.asList(tab).stream().filter(el->el<midEl).collect(Collectors.toList());
        higherList=Arrays.asList(tab).stream().filter(el->el>midEl).collect(Collectors.toList());

        Integer[] newTab=new Integer[tab.length];

        finalList=lowerList;
        finalList.addAll(midList);
        finalList.addAll(higherList);
        newTab=finalList.toArray(newTab);

        System.out.println(Arrays.toString(newTab));
        return newTab;
    }

}
