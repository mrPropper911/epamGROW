package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double x;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(buffer.readLine());
        if (x <= 3)
            System.out.println( x * x - 3 * x + 9);
        else if (x > 3)
            System.out.println( y = 1 / (Math.pow(x,3)+6));
    }
}
