package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*7. Пусть даны две неубывающие последовательности действительных чисел.
	Требуется указать те места, на которые нужно вставлять элементы последовательности
	в первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/
        int m; //size first array
        int n; //size second array
        int k;
        int temp;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size first array: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter size second array: ");
        n = Integer.parseInt(buff.readLine());

        int[] firstArray = new int[m];
        int[] secondArray = new int[n];
        Random r = new Random();

        for (int i = 0; i < m; i++){
            firstArray[i] = r.nextInt(9-1)+1;
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            secondArray[i] = r.nextInt(9-1)+1;
        }
        System.out.println();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print(secondArray[i] + " ");
        }

        System.out.println("\nPlace to paste: ");
        int j = 0;
        for (int i = 0; i < m; i++){
            if (firstArray[i] > secondArray[j]){
                System.out.print(i + " ");
                j++;
            }
            if (j == n)
                break;
        }
    }
}
