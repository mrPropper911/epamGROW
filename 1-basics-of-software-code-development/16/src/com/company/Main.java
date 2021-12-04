package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double e, a;
        double sum = 0;
        int n;
        int i = 0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        e = Double.parseDouble(buff.readLine());
        n = Integer.parseInt(buff.readLine());
        while (i < n){
            a = 1/Math.pow(2,i) + 1/Math.pow(3,i);
            if (Math.abs((double)a) >=e){
                sum+= a;
            }
            i++;
        }
        System.out.println(sum);
    }
}
