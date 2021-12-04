package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int num;
        int i = 1;
        int sum = 0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(buff.readLine());
        while (i != num){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
