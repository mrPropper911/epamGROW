package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
	восклицательным или вопросительным знаком. Определить количество предложений в строке X.*/
        String str;
        int countOfsentences = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        char[] strToArray = str.toCharArray();
        for(int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == '.' || strToArray[i] == '!'|| strToArray[i] == '?'){
                countOfsentences++;
            }
        }

        System.out.println("The number of sentences in the text: " + countOfsentences);
    }
}
