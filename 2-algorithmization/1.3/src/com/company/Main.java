package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/* 3. Дан массив действительных чисел, размерность которого N.
	 Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. */
        int N; //number of elements
        int numberOfzero = 0;
        int numberOfnegative = 0;
        int numberOfpositive = 0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        N = Integer.parseInt(buff.readLine());

        double[] array = new double[N];
        System.out.println("Enter " + N + " array elements:");
        for (int i = 0; i < N; i++){
            array[i] = Double.parseDouble(buff.readLine());
        }

        for (int i = 0; i < N; i++){
            if (array[i] > 0)
                numberOfpositive++;
            else if (array[i] < 0)
                numberOfnegative++;
            else
                numberOfzero++;
        }

        System.out.println(" Number of negative elements: " + numberOfnegative);
        System.out.println(" Number of positive elements: " + numberOfpositive);
        System.out.println(" Number of zero element: " + numberOfzero);
    }
}
