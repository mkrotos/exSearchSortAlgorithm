package com.krotos;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        for(int i=0;i<input.length;i++){
            if (input[i]==value){
                return i;
            }
        }
        return -1;
    }
}
