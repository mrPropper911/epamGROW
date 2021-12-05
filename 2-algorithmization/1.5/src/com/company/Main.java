package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*. Даны целые числа а1 ,а2 ,..., аn .
	 Вывести на печать только те числа, для которых аi > i*/
        int n; //number of elements

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());

        int[] array = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(buff.readLine());
        }

        //search аi > i
        System.out.println("Elements that meet the condition: ");
        for (int i = 0; i < n; i++){
            if (array[i] > i)
                System.out.print(array[i] + " ");
        }
    }
}