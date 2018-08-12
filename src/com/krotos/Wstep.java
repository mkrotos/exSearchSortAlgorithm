package com.krotos;

import java.util.Arrays;

public class Wstep {

    public int[] zamiana(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
        System.out.println("Zamiana: " + Arrays.toString(tab));
        return tab;
    }

    public void wypiszZIndeksem(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + ": " + tab[i]);
        }
    }

    public void wypiszJakKwadrat(int[] tab) {
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print(i + ": " + tab[i] + " | ");
            }
            System.out.println();
        }
    }

    public void wypiszJakWyzejZZamiana(int[] tab) {
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print(i + ": " + tab[i] + " | ");
            }
            System.out.println();
            try {
                int temp = tab[j];
                tab[j] = tab[j + 1];
                tab[j + 1] = temp;
            } catch (ArrayIndexOutOfBoundsException e) {
                //nic
            }
        }
    }
}


