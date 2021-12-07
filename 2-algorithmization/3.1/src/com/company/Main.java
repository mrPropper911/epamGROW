package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив. */
        int m; //size first array
        int n; //size second array
        int k;
        int temp;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size first array: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter size second array: ");
        n = Integer.parseInt(buff.readLine());
        System.out.println("Enter k: ");
        k = Integer.parseInt(buff.readLine());

        int[] firstArray = new int[m];
        int[] secondArray = new int[n];
        Random r = new Random();

        for (int i = 0; i < m; i++){
            firstArray[i] = r.nextInt(9-1)+1;
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            secondArray[i] = r.nextInt(9-1)+1;
            System.out.print(secondArray[i] + " ");
        }

        for (int i = 0 ; i < n; i++){
            temp = firstArray[k+i];
            firstArray[k+i] = secondArray[i];
            secondArray[i] = temp;
        }

        System.out.println();
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }
    }
}
