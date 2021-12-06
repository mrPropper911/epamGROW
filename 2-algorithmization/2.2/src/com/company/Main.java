package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
        int n;//matrix size

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter matrix size: ");
        n = Integer.parseInt(buff.readLine());

        //create matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 1+(int)(Math.random()*100);
            }
        }

        //search diagonal matrix and out
        for (int i = 0; i < n; i++){
            System.out.print(matrix[i][i] + " ");
        }
    }
}
