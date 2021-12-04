package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	 double a,b,c,d;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(buff.readLine());
        b = Double.parseDouble(buff.readLine());
        c = Double.parseDouble(buff.readLine());
        d = Double.parseDouble(buff.readLine());
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
