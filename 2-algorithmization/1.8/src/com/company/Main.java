package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	/*8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
	Образовать новую последовательность, выбросив из исходной те члены,
	 которые равны min(а1 ,а2 ,..., аn)*/
        int n; //number of elements
        int min;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());

        int[] array = new int[n];
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(buff.readLine());
        }

        //search min element
        min = array[0];
        for (int i = 1; i < n; i++){
            if (array[i] < min)
                min = array[i];
        }

        //creating new array without min element
        for (int i = 0; i < n; i++){
            if (array[i] != min)
                list.add(array[i]);
        }

        System.out.println("New array without min element: \n");
        for (Integer index : list){
            System.out.print(index + " ");
        }
    }
}