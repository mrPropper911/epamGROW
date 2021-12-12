package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int countNum(int N){
        int diggit = 0;
        while (N!=0){
            diggit++;
            N /=10;
        }
        return diggit;
    }

    public static boolean checkNum(int N){
        int digit1;
        int digit2;
        int check = 0;
        int count = countNum(N);
        while (N!=0){
            digit1 = N % 10;
            N /=10;
            digit2 = N % 10;
            if (digit1 > digit2)
                check++;
            N /=10;
        }
        if (check == count-1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
	/*15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
        int n;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        n = Integer.parseInt(buff.readLine());

        for (int i = 0; i <= n; i++){
            if (checkNum(i))
                System.out.print(i + " ");
        }
    }
}
