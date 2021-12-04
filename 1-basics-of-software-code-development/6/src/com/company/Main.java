package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    double x,y;
        boolean answer = false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(buff.readLine());
        y = Double.parseDouble(buff.readLine());
        if ((y <= 4 && y >= -3) && (x <= 4 && x >= -4)){
            answer = true;
        }
        if (answer){
            if ((y > 0  && x>2) || (y > 0 && x < -2))
                answer = false;
        }
        System.out.println(answer);
    }
}
