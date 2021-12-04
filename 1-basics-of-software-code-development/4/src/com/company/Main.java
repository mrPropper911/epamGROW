package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double R, answer;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        R = Double.parseDouble(buff.readLine());
        R = R * 1000;
        answer = (R % 1000) + ( R /1000000);
        System.out.println(String.format("%.3f",answer));
    }
}
