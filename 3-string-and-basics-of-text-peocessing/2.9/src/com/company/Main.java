package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
	Учитывать только английские буквы.*/
        String str;
        int countUppercase = 0;
        int countLowercase = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();
        str = str.trim().replace(" ","");

        char[] strToArray = str.toCharArray();
        for(int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] >= 65 && strToArray[i] <= 90){
                countUppercase++;
            }
            else if (strToArray[i] >= 97 && strToArray[i] <= 122)
                countLowercase++;
            else{
                System.out.println("Enter correct text (only english letters)");
                return;
            }
        }

        System.out.println("Number of uppercase letters: " + countUppercase
                + "\nNumber of lowercase letters: " + countLowercase);
    }
}
