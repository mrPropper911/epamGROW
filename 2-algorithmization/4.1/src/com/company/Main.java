package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int nod(int x, int y){
        if (y == 0){
            return x;
        }
        return nod(y, x % y);
    }
    public static int nok(int x, int y){
        return x*y/nod(x, y);
    }

    public static void main(String[] args) throws IOException {
	/*1. Написать метод(методы) для нахождения наибольшего общего делителя
	и наименьшего общего кратного двух натуральных чисел: */
        int n;
        int c;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First number: ");
        n = Integer.parseInt(buff.readLine());
        System.out.println("Second number: ");
        c = Integer.parseInt(buff.readLine());

        System.out.println("NOD " + nod(n,c));
        System.out.println("NOK " + nok(n,c));
    }
}
