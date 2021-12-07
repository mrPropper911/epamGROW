package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int binarySort (int[] array, int item, int last){
        int first = 0;
        int position;
        position = (first + last) / 2;
        while ((array[position] != item) && (first <= last)) {
            if (array[position] < item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }

        return position;

    }

    public static void main(String[] args) throws IOException {
	// write your code here
        int m; //size first array
        int temp;
        int t;


        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        m = Integer.parseInt(buff.readLine());

        int[] firstArray = new int[m];
        Random r = new Random();
        for (int i = 0; i < m; i++){
            firstArray[i] = r.nextInt(9-1)+1;
        }
        System.out.println();
        //Arrays.sort(firstArray);
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }

        //insertion sort
        for (int i = 1; i < m; i++){
            temp = firstArray[i];
            int j = i - 1;

            while (j >= 0 && firstArray[j] < temp) {
                firstArray[j + 1] = firstArray[j];
                j = j - 1;
            }
            firstArray[j + 1] = temp;
        }


        System.out.println("\nAfter sort: ");
        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }
    }
}
