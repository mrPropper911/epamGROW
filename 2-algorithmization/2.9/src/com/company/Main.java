package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
	Определить, какой столбец содержит максимальную сумму.*/
        int m;//number of column
        int n;//number of row
        int maxSum = 0;
        int maxTemp = 0;
        int maxColumns =0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of column: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter number of row: ");
        n = Integer.parseInt(buff.readLine());

        //create matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 1+(int)(Math.random()*100);
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            maxTemp = 0;
            for (int j = 0; j < m; j++){
                maxTemp += matrix[j][i];
            }
            if (maxTemp > maxSum){
                maxSum = maxTemp;
                maxColumns = i + 1;
            }
        }

        System.out.println(maxColumns + " - the column contains the maximum amount");
    }
}
