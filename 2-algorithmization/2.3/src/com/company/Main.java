package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы*/
        int m;//number of rows
        int n;//number of columns
        int k;//rows for out
        int p;//columns for out

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter number of columns: ");
        n = Integer.parseInt(buff.readLine());
        System.out.println("Enter number row for out: ");
        k = Integer.parseInt(buff.readLine());
        System.out.println("Enter number column for out: ");
        p = Integer.parseInt(buff.readLine());

        //create matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 1+(int)(Math.random()*100);
            }
        }

        System.out.println("Row #" + k + " for out: " );
        for (int i = 0; i < n; i++){
            System.out.print(matrix[k-1][i] + " ");
        }
        System.out.println("\nColumn #" + p + " for out: " );
        for (int i = 0; i < n; i++){
            System.out.print(matrix[i][p-1] + " ");
        }

    }
}
