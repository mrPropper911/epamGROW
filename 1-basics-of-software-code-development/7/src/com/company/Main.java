package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double deg1, deg2;
        boolean answer = false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        deg1 = Double.parseDouble(buff.readLine());
        deg2 = Double.parseDouble(buff.readLine());

        if ( (deg1 + deg2) < 180){
            if (deg1 == 90 || deg2 == 90 || (180 - deg1 - deg2) == 90)
                answer =true;
        }
        else{
            System.out.println("Does not exist");
            return;
        }

        if (answer)
            System.out.println("This triangle is rectangular");
        else
            System.out.println("This triangle is not rectangular");
    }
}
