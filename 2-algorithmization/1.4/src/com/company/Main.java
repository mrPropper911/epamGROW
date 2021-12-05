package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*4. Даны действительные числа а1 ,а2 ,..., аn .
	Поменять местами наибольший и наименьший элементы. */
        int n; //number of elements
        double maxOfarray;
        double minOfarray;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());

        double[] array = new double[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Double.parseDouble(buff.readLine());
        }

        //search max && min of array
        maxOfarray = array[0];
        minOfarray = array[0];
        for (int i = 1; i < n; i++){
            if (array[i] > maxOfarray)
                maxOfarray = array[i];
            else if (array[i] < minOfarray)
                minOfarray = array[i];
        }

        System.out.println("Maximum element is " + maxOfarray);
        System.out.println("Minimum element is " + minOfarray);

    }
}
