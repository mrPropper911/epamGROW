package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
	Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
        String str;
        int countMax = 0;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        String[] strToArray = str.split(" ");
        for(int i = 0; i < strToArray.length; i++) {
            count =  strToArray[i].length();
            if (count > countMax)
                countMax = count;
        }

        for(int i = 0; i < strToArray.length; i++){
            if (strToArray[i].length() == countMax)
                System.out.println(strToArray[i]);
        }
    }
}
