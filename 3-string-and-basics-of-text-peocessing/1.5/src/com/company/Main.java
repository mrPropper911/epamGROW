package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*5. Удалить в строке все лишние пробелы, то есть серии подряд идущих
	пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.*/
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        while(str.contains("  ")) {
            str= str.replace("  ", " ");
        }
        System.out.println("Line after change:\n" + str.trim());
    }
}
