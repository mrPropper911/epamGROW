package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать*/
        int n; //number of elements
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(buff.readLine());
        int[] array = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(buff.readLine());
        }

        //swap every second element
        int count = n;
        for (int i = 0; i < n; i++){
            if (i % 2 != 0){
                for (int j = i; j < n; j++){
                    array[j] = array[j+1];
                    n--;
                }
            }
        }

        //fill in the empty spaces with zeros
        for (int i = n; i < count; i++){
            array[i] = 0;
        }
        for (int i = 0; i < count; i++){
            System.out.print(array[i] + " ");
        }
    }
}