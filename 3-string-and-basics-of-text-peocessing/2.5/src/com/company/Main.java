package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/
        String str;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        char[] strToArray = str.toCharArray();
        for(int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == 'a'){
                count++;
            }
        }

        System.out.println("Largest number of 'a': " + count);
    }
}
