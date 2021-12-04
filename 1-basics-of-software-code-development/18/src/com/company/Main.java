package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	int m, n, divider;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(buff.readLine());
        n = Integer.parseInt(buff.readLine());
        while (m != n){
            divider = 2;
            while (divider < m){
                if (m%divider == 0)
                    System.out.print(m + " - " + divider + " ");
                divider++;
            }
            System.out.println();
            m++;
        }
    }
}
