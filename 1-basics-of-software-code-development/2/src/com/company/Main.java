package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double a,b,c,z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());
        z = (b + Math.sqrt(Math.pow(b,2)+4 * a * c))/2 * a - Math.pow(a,3) * c + Math.pow(b,(-2));
        System.out.println(z);
    }
}
