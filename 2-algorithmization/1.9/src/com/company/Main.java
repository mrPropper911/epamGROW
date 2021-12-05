package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
	Если таких чисел несколько, то определить наименьшее из них*/
        int n; //number of elements
        int maxRepetitions = 0;
        int minValueOfrepetitions;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());

        int[] array = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(buff.readLine());
        }

        //calculate the number of repetitions
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (!hashMap.containsKey(array[i]))
                hashMap.put(array[i],1);
            else
                hashMap.put(array[i],hashMap.get(array[i]) + 1);
        }

        //search max repetitions
        for (Map.Entry entry : hashMap.entrySet()){
            if ((int) entry.getValue() > maxRepetitions)
                maxRepetitions = (int) entry.getValue();
        }

        //search min value of max repetitions
        minValueOfrepetitions = hashMap.keySet().stream().findFirst().get();
        for (Map.Entry entry : hashMap.entrySet()){
            if ((int) entry.getValue() == maxRepetitions && (int) entry.getKey() < minValueOfrepetitions){
                minValueOfrepetitions = (int) entry.getKey();
            }
        }

        System.out.println("Еhe smallest element with the most repetitions: " + minValueOfrepetitions);
    }
}