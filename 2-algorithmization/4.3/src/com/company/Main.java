package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double areaTriangle (double a){
        return a * Math.pow(3,1.0/2)/4;
    }

    public static void main(String[] args) throws IOException {
	/*3. Вычислить площадь правильного шестиугольника со стороной а,
	 используя метод вычисления площади треугольника.*/
        double a;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Side of a triangle: ");
        a = Double.parseDouble(buff.readLine());

        System.out.println("Hexagon: " + areaTriangle(a) * 6);
    }
}
