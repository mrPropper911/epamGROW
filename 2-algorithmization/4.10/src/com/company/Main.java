package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
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
	/*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.*/
        int N;
        List<Integer> array = new ArrayList<>();

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        N = Integer.parseInt(buff.readLine());

        array = splitNumber(N);
        for (Integer x : array){
            System.out.print(x + " ");
        }
    }
}
