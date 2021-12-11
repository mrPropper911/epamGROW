package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static public double square(int X, int Y, int Z, int T){
        return X * Math.abs(Y-Z) + 0.5 * X * Math.sqrt(T*T - X*X);
    }

    public static void main(String[] args) throws IOException {
	/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.*/
        int X;
        int Y;
        int Z;
        int T;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sides of the rectangle: ");
        X = Integer.parseInt(buff.readLine());
        Y = Integer.parseInt(buff.readLine());
        Z = Integer.parseInt(buff.readLine());
        T = Integer.parseInt(buff.readLine());

        System.out.println(square(X, Y, Z, T));
    }
}
