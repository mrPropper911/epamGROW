package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double x1,y1,x2,y2,x3,y3;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        x1 = Double.parseDouble(buff.readLine());
        y1 = Double.parseDouble(buff.readLine());
        x2 = Double.parseDouble(buff.readLine());
        y2 = Double.parseDouble(buff.readLine());
        x3 = Double.parseDouble(buff.readLine());
        y3 = Double.parseDouble(buff.readLine());
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) || x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3)
            System.out.println("Points are located on one straight line");
        else
            System.out.println("Points are not located on one straight line");
    }
}
