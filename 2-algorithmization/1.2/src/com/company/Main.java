package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class Main {

    public static void main(String[] args) throws IOException {
	/* 2. Дана последовательность действительных чисел а1 ,а2 ,..., аn.
	Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/
        int n; //number of elements
        double Z;
        int amount = 0; //number of replacements

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());
        System.out.println("Enter search item Z: ");
        Z = Double.parseDouble(buff.readLine());

        double[] array = new double[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Double.parseDouble(buff.readLine());
        }

        for (int i = 0; i < n; i++){
            if (array[i] > Z){
                array[i] = Z;
                amount++;
            }
        }

        System.out.println("Array after replacements: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNumber of replacements: " + amount);
    }
}
