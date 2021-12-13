package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
	/*7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
	Например, если было введено "abc cdedef", то должно быть выведено "abcdef".*/
        String str;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();
        str = str.replace(" ","");

        char[] strToArray = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < strToArray.length; i++) {
            if (i == 0){
                arrayList.add(strToArray[i]);
                continue;
            }
            for (int j = 0; j < arrayList.size(); j++){
                if (arrayList.get(j) == strToArray[i])
                    break;
                else if (j == arrayList.size()-1)
                    arrayList.add(strToArray[i]);
            }
        }
        for (Character index : arrayList){
            System.out.print(index);
        }
    }
}