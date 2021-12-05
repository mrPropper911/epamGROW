package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*Даны действительные числа а1 ,а2 ,..., аn.
	Найти max(a1 + a2n, a2 + a2n-1, ... , an+ an+1) */
        int n; //number of elements
        double max;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());

        double[] array = new double[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Double.parseDouble(buff.readLine());
        }

        //create new array with sum an + an+1
        double[] arrayHalf = new double[n/2];
        for (int i = 0; i < n/2; i++){
            arrayHalf[i] = array[i] + array[n-1-i];
        }

        //search max element of new array
        max = arrayHalf[0];
        for (int i = 1; i < n/2; i++){
            if (arrayHalf[i] > max)
                max = arrayHalf[i];
        }

        System.out.println("max(a1 + a2n, a2 + a2n-1, ... , an+ an+1) = " + max);
    }
}