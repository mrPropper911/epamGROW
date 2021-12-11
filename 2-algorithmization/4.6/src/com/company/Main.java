package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int nod(int x, int y) {
        if (y == 0) {
            return x;
        }
        return nod(y, x % y);
    }

    public static boolean simpleCheck (int a, int b, int c){

        if (nod(a,b) == 1 && nod(a,c) == 1 && nod(b,c) == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
	/*6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/
        int a, b, c;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three number: ");

        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        c = Integer.parseInt(bufferedReader.readLine());

        if (simpleCheck(a,b,c))
            System.out.println("Condition is met");
        else
            System.out.println("Condition is not met");
    }
}
