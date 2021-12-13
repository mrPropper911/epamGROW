package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*2. В строке вставить после каждого символа 'a' символ 'b'.*/
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();
        System.out.println(str.replace("a","ab"));
    }
}
