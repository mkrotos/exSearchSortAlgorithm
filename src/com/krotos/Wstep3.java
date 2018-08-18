package com.krotos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Wstep3 {
    int randEl;

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
        tempList= Arrays.asList(tab).stream().filter(el->el<=randEl).collect(Collectors.toList());
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



}
