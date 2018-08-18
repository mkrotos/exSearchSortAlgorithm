package com.krotos.cwiczenia;

public class BinaryTree {

    Integer[] tab;

    public BinaryTree(Integer[] tab) {
        this.tab = tab;
    }

    public int getLeftSonInd(int index) {
        return 2 * index + 1;
    }

    public int getRightSonInd(int index) {
        return 2 * index + 2;
    }

    public int getFatherInd(int index) {
        if (index > 0) {
            return ((index - 1) / 2);
        } else {
            System.out.println("nie ma");
            return 0;
        }

    }
    public boolean hasLeftSon(int index){
        if(2*index+1<tab.length){
            return true;
        }else {
            return false;
        }
    }
    public boolean hasRightSon(int index){
        if(2*index+2<tab.length){
            return true;
        }else {
            return false;
        }
    }
    public boolean isLeaf(int index){
        if(2*index+2>=tab.length){
            return true;
        } else {
            return false;
        }
    }
}
