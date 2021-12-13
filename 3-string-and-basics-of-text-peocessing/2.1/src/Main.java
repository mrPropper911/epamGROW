import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/
        String str;
        int countMax = 0;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        char[] strToArray = str.toCharArray();
        for(int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == ' '){
                count++;
            }
            else {
                if (count > countMax){
                    countMax = count;
                    count = 0;
                }
            }
        }

        System.out.println("Largest number of spaces: " + countMax);
    }
}

