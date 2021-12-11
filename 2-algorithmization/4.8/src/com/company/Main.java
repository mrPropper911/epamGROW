package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int[] sum(int[] array, int k, int m){
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++){
            for (int j = k+i+3; j < m+i+3; j++){
                temp[i] += array[j];
            }
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
	/*8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;//size array
        int k;
        int m;
        System.out.println("Enter size of array: ");
        n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter K: ");
        k = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter M: ");
        m = Integer.parseInt(bufferedReader.readLine());

        int[] arrayD = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arrayD[i] = r.nextInt(100) - 50;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrayD[i] + " ");
        }

        int[] temp = new int[3];
        temp = sum(arrayD, k, m);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
