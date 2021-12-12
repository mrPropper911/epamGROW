import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*3. В строке найти количество цифр */
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line: ");
        str = bufferedReader.readLine();

        str = str.replaceAll("[^0-9]+", " ");
        int count = str.trim().split(" ").length;
        System.out.println("number of digits in a line: " + count);
    }
}

