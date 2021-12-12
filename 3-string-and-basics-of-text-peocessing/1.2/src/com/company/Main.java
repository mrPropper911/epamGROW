package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*2. Замените в строке все вхождения 'word' на 'letter'*/
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();
        System.out.println(str.replace("word", "letter"));
    }
}
