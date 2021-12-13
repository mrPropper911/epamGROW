package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*6. Из заданной строки получить новую, повторив каждый символ дважды.*/
        String str;
        int countMax = 0;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        char[] strToArray = str.toCharArray();
        char[] strX2 = new char[strToArray.length*2];

        int j = 0;
        for(int i = 0; i < strX2.length; i+=2) {
            strX2[i] = strToArray[j];
            strX2[i+1] = strToArray[j];
            j++;
        }

        for(int i = 0; i < strX2.length; i++){
            System.out.print(strX2[i] + "");
        }
    }
}
