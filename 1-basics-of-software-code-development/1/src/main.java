import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        double a,b,c,z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());
        z = (((a-3)*b)/2)+c;
        System.out.println(z);
    }
}
