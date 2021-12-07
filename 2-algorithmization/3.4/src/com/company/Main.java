package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*3. Сортировка выбором.Дана последовательность чисел .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/
        int m; //size first array
        int temp;
        boolean check = false;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        m = Integer.parseInt(buff.readLine());

        int[] firstArray = new int[m];
        Random r = new Random();
        for (int i = 0; i < m; i++){
            firstArray[i] = r.nextInt(9-1)+1;
        }
        System.out.println();
        Arrays.sort(firstArray);
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }

        //selection sort
        while (!check){
            check = true;
            for (int i = 0; i < m-1; i++){
                if (firstArray[i] < firstArray[i+1]){
                    check = false;
                    temp = firstArray[i];
                    firstArray[i] = firstArray[i+1];
                    firstArray[i+1] = temp;
                }
            }
        }

        System.out.println("\nAfter sort: ");
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }
    }
}
