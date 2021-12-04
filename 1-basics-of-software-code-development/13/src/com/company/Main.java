package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double a, b, h, x;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(buff.readLine());
        b = Double.parseDouble(buff.readLine());
        h = Double.parseDouble(buff.readLine());
        for (x = a; x <= b - h; x+=h ){
            if (x > 2)
                System.out.println("y = " + x);
            else
                System.out.println("y = " + (x * (-1)));
        }
    }
}
