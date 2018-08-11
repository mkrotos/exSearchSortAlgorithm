package com.krotos;

import java.util.List;

public interface SearchAlgorithm {
    Integer search(Integer value, List<Integer> input);
    Integer search(Integer value, Integer[] input);

}
