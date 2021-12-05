package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*. В массив A [N] занесены натуральные числа.
 Найти сумму тех элементов, которые кратны данному К. */
        int N; //array size
        int K; //which multiply
        int sum = 0; //sum of elements

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        N = Integer.parseInt(buff.readLine());
        System.out.println("Enter which is multiply number: ");
        K = Integer.parseInt(buff.readLine());

        int[] A = new int[N];
        System.out.println("Enter " + N + " array elements:");
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(buff.readLine());
        }

        for (int i = 0; i < N; i++){
            if (A[i]%K == 0)
                sum+=A[i];
        }

        System.out.println("Sum of elements multiply " + K + " is: " + sum);
    }
}
