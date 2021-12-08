package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static double distance (int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static void main(String[] args) throws IOException {
	/*4. На плоскости заданы своими координатами n точек. Написать метод(методы),
	определяющие, между какими из пар точек самое большое расстояние. Указание.
	Координаты точек занести в массив.*/

        int n;//amount of points
        double maxDistance;
        int firstDot;
        int secondDot;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        n = Integer.parseInt(buff.readLine());

        Random r = new Random();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = r.nextInt(100) - 50;
            y[i] = r.nextInt(100) - 50;
        }

        System.out.println("Array points: ");
        for (int i = 0; i < n; i++){
            System.out.print("(" + x[i] + "," + y[i] + ") ");
        }

        maxDistance = distance(x[0], y[0], x[1], y[1]);
        firstDot = 0;
        secondDot = 1;
        for (int j = 0; j < n-1; j++){
            for (int i = 1; i < n; i++){
                if (distance(x[j], y[j], x[i], y[i]) > maxDistance){
                    maxDistance = distance(x[j], y[j], x[i], y[i]);
                    firstDot = j;
                    secondDot = i;
                }
            }
        }

        System.out.println("\nMax distance: " + maxDistance);
        System.out.println("Points: " + "(" + x[firstDot] + "," + y[firstDot] + ") (" +
                x[secondDot] + "," + y[secondDot] + ")");
    }
}
