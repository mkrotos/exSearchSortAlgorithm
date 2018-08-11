package com.krotos;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        for(int i=0;i<input.size();i++){
            if (input.get(i)==value){
                return i;
            }
        }
        return -1;
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
