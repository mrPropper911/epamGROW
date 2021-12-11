package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> splitNumber(int N){
        int digit;
        List<Integer> array = new ArrayList<>();
        while (N!=0){
            digit = N % 10;
            array.add(digit);
            N /=10;
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
	/*11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/
        int N1;
        int N2;

        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        N1 = Integer.parseInt(buff.readLine());
        System.out.println("Enter number 2: ");
        N2 = Integer.parseInt(buff.readLine());

        array1 = splitNumber(N1);
        array2 = splitNumber(N2);

        if (array1.size() > array2.size())
            System.out.println(N1 + " > " + N2);
        else
            System.out.println(N2 + " > " + N1);
    }
}
