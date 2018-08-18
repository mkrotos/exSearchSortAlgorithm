package com.krotos.cwiczenia;

public class BinaryTree {

    private Integer[] tab;

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
            return -1;
        }

    }

    public boolean hasLeftSon(int index) {
        return 2 * index + 1 < tab.length;
    }

    public boolean hasRightSon(int index) {
        return 2 * index + 2 < tab.length;
    }

    public boolean isLeaf(int index) {
        return 2 * index + 2 >= tab.length;
    }
    public boolean isFatherBiger(int index){
        System.out.println("Father: "+tab[getFatherInd(index)]);
        System.out.println("Son: "+tab[index]);
        return tab[getFatherInd(index)]>=tab[index];
    }

    public void swapWithSon(int index){

    }


    enum Child{
        LEFT,
        RIGHT;

        public int getIndex(int parentInd){
            if(this.equals(LEFT)){
                return 2*parentInd+1;
            }else {
                return 2*parentInd+2;
            }
        }
    }
}
