package com.krotos.cwiczenia;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Wstep2 {

    public List<Integer> removeDuplicateAndSort(List<Integer> list) {
        System.out.println("List " + list);
        return list.stream().collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
    }

    private List<Car> listOfCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Prosie", LocalDate.of(2007, 3, 3), 155, 230));
        list.add(new Car("Borgini", LocalDate.of(2011, 11, 5), 220, 500));
        list.add(new Car("Masierati", LocalDate.of(1999, 3, 3), 222, 555));
        list.add(new Car("Aston", LocalDate.of(1999, 3, 3), 222, 210));
        list.add(new Car("Bugati", LocalDate.of(1999, 3, 3), 122, 111));
        return list;
    }

    public void sortCars() {
        List<Car> list = listOfCars();
        
        System.out.println("po dacie: ");
        list.stream().sorted(Comparator.comparing(car -> car.productionDate))
            .forEach(car -> System.out.println(car));
        
        System.out.println("po koniach: ");
        list.stream().sorted(Comparator.comparing(car -> car.engine.getHorsePower()))
            .forEach(System.out::println);
        
        System.out.println("po wszystkim");
        list.stream().sorted(Comparator.comparing(car -> car.name))
            .sorted(Comparator.comparing(car -> car.engine.getHorsePower()))
            .sorted(Comparator.comparing(car -> car.productionDate))
            .forEach(System.out::println);
    }

    private int[] initTab() {
        return new int[]{2, 2, 2, 4, 4, 4, 4, 1, 1, 1};
    }

    public int[] zad3() {
        int[] tab = initTab();
        System.out.println("stara: "+Arrays.toString(tab));
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        for (int i = 0; i < tab.length; i++) {
            if (map.containsKey(tab[i])) {
                temp = map.get(tab[i]);
                map.put(tab[i], ++temp);
            } else {
                map.put(tab[i], 1);
            }
        }
        map.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println("map: "+map);
        int[] newTab = new int[map.values().stream().mapToInt(a -> a).sum()];
        int index = 0;
        for (int key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                newTab[index++] = key;
            }
        }
        System.out.println("nowa " + Arrays.toString( newTab));
        return newTab;
    }

}
