package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double z,x,y;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(buff.readLine());
        y = Double.parseDouble(buff.readLine());
        z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println(z);
    }
}
