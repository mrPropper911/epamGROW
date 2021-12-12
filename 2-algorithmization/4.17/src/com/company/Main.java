package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int sumNumber(int N){
        int digit;
        int sum = 0;
        while (N!=0){
            digit = N % 10;
            sum += digit;
            N /=10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
	/*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
        int N;
        int count = 0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        N = Integer.parseInt(buff.readLine());

        while (N > 0){
            N -= sumNumber(N);
            count ++;
        }
        System.out.println("Count: " + count);
    }
}
