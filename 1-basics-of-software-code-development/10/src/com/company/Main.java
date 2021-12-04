package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double A, B, x, y, z;
        boolean answer = false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        A = Double.parseDouble(buff.readLine());
        B = Double.parseDouble(buff.readLine());
        x = Double.parseDouble(buff.readLine());
        y = Double.parseDouble(buff.readLine());
        z = Double.parseDouble(buff.readLine());
        if ((y <= A) && (z <= B) || (x <= A) && (z <= B) || (x <= A) && (y <= B))
            System.out.println("The brick will enter");
        else
            System.out.println("Brick won't fit");
    }
}
