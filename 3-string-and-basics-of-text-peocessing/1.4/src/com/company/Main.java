package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/* 4. В строке найти количество чисел. */
        String str;
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        String[] arrayStrint = str.split(" ");

        for (String s : arrayStrint){
            try {
                Integer.parseInt(s);
            }catch (NumberFormatException e){
                count++;
            }
        }
        System.out.println("Number of numbers in a line: " + (arrayStrint.length - count));
    }
}
