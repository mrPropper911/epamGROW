package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
	/*1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/
        int n;//size array

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        n = Integer.parseInt(bufferedReader.readLine());

        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = bufferedReader.readLine();
        }
        String sOut = "";
        for (int i = 0; i < n; i++){
            String[] r = array[i].split("(?=\\p{Upper})");
            for (int j = 0; j < r.length; j++){
                    sOut = sOut + r[j] + "_";
            }
            sOut = sOut.substring(0,sOut.length()-1);
            System.out.println(sOut);
            sOut = "";
        }
    }
}
