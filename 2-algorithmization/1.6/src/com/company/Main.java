package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //algorithm for searching prime numbers
    public static boolean isPrime (int n){
        if (n == 2 || n == 3)
            return true;

        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6){
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
	/*6. Задана последовательность N вещественных чисел.
	Вычислить сумму чисел, порядковые номера которых являются простыми числами.*/
        int N; //number of elements
        double sum = 0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        N = Integer.parseInt(buff.readLine());

        double[] array = new double[N];
        System.out.println("Enter " + N + " array elements:");
        for (int i = 0; i < N; i++){
            array[i] = Double.parseDouble(buff.readLine());
        }

        for (int i = 0; i < N; i++){
            if (isPrime(i))
                sum+=array[i];
        }

        System.out.println("Sum of elements: " + sum);
    }
}