package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int nod(int x, int y){
        if (y == 0){
            return x;
        }
        return nod(y, x % y);
    }

    public static int nodArray(int[] array){
        int nd = array[0];
        for (int i=1; i<array.length; i++){
            nd=nod((nd<array[i]?nd:array[i]),(nd<array[i]?array[i]:nd));
        }
        return nd;
    }

    public static void main(String[] args) throws IOException {
	/*2. Написать метод(методы) для нахождения наибольшего
	общего делителя четырех натуральных чисел*/
        int n = 4;
        int nd;

        Random r = new Random();
        int[] p = new int[n];
        for (int i = 0; i < n; i++){
            p[i] = r.nextInt(10-2) + 2;
        }

        System.out.println("First state: ");
        for (int i = 0; i < n; i++){
            System.out.print(p[i] + " ");
        }

        nd = nodArray(p);
        System.out.println("\nCommon denominator: ");
        System.out.println(nd);

    }
}
