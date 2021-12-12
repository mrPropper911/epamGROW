package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean numberAmstrong(int N){
        int check = N;
        int digit;
        int n;
        int sum = 0;
        List<Integer> array = new ArrayList<>();
        while (N!=0){
            digit = N % 10;
            array.add(digit);
            N /=10;
        }
        n = array.size();
        for (Integer i : array){
            sum += Math.pow(i, n);
        }
        if (sum == check)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
	/*14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию*/
        int K;

        List<Integer> array = new ArrayList<>();

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter K: ");
        K = Integer.parseInt(buff.readLine());

        for (int i = 1; i < K; i++ ){
            if (numberAmstrong(i))
                System.out.print(i + " ");
        }
    }
}
