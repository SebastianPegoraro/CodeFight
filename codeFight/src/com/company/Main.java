package com.company;

public class Main {

    public static void main(String[] args) {
        /*int [] statues = {1, 2, 3, 4, 3, 6};
        Practice p = new Practice();
        System.out.println(p.almostIncreasingSequence(statues));*/

        int [][] test = {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        int contCol=0,contFila=0;
        for (int i=0; i<test.length; i++){
            for (int j=0; j<test.length; j++){
                contCol++;
            }
            contFila++;
            System.out.print("\n");
        }
    }
}
