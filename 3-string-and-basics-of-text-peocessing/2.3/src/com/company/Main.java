package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*3. Проверить, является ли заданное слово палиндромом.*/
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        char[] arrayChars = str.toCharArray();
        for (int i = 0; i < arrayChars.length/2; i++){
            if (arrayChars[i] != arrayChars[arrayChars.length- 1 - i]){
                System.out.print("Is NOT a palindrome!");
                return;
            }
        }
        System.out.println("Is a palindrome");
    }
}
