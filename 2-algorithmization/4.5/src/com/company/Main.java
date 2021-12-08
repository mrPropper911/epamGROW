package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

        int n;//size array
        int maxSecond;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        n = Integer.parseInt(buff.readLine());

        Random r = new Random();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = r.nextInt(100) - 50;
        }

        System.out.println("Array: ");
        for (int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }

        int max = A[0];
        for (int i = 1; i < n; i++){
            if (A[i] > max)
                max = A[i];
        }
        if (A[0] == max)
            maxSecond = A[1];
        else
            maxSecond = A[0];

        for (int i = 1; i < n; i++){
            if (A[i] > maxSecond && A[i] != max)
                maxSecond = A[i];
        }

        System.out.println("\nSecond largest number: "+ maxSecond);

    }
}
