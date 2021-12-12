package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int splitNumberSum(int N){
        int digit;
        int sum = 0;
        List<Integer> array = new ArrayList<>();
        while (N!=0){
            digit = N % 10;
            sum +=digit;
            N /=10;
        }
        return sum;
    }

    public static ArrayList<Integer> createNum (int K, int N){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; splitNumberSum(i) < N; i++){
            int a = splitNumberSum(i);
            if (a == K)
                array.add(i);
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
	/*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	элементами которого являются числа, сумма цифр которых равна К и которые не большее N.*/
        int K;
        int N;
        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter K: ");
        K = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter N: ");
        N = Integer.parseInt(bufferedReader.readLine());

        array = createNum(K, N);
        for (Integer i : array){
            System.out.print(i + " ");
        }
    }
}
