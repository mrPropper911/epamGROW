package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int countNum(int N){
        int diggit = 0;
        while (N!=0){
            diggit++;
            N /=10;
        }
        return diggit;
    }

    public static int checkNum(int N){
        int digit1;
        int sum = 0;

        while (N!=0){
            digit1 = N % 10;
            if (digit1 %2 != 0)
                sum += digit1;
            else
                return -1;
            N /=10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
	/*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/
        int n;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        n = Integer.parseInt(buff.readLine());

        for (int i = 0; i <= n; i++){
            if (checkNum(i) != -1)
                System.out.print("\nNumber: " + i + " sum: " + checkNum(i) + " count: " + countNum(i));
        }
    }
}
