package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*4. С помощью функции копирования и операции конкатенации
	составить из частей слова “информатика” слово “торт”. */
        String str = "информатика";

        char[] arrayChar = new char[4];

        str.getChars(7,8,arrayChar,0);
        str.getChars(3,4,arrayChar,1);
        str.getChars(4,5,arrayChar,2);
        str.getChars(7,8,arrayChar,3);

        System.out.println(Character.toString(arrayChar[0]) + Character.toString(arrayChar[1])
                + Character.toString(arrayChar[2]) + Character.toString(arrayChar[3]));
    }
}
