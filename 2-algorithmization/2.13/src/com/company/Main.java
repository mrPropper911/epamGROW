package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/
        int m;//number of column
        int n;//number of row
        boolean isSorted = false;
        int buf;

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

        //bubble sort ->
        for (int i = 0; i < n; i++){
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < m-1; j++){
                    if (matrix[j][i] > matrix[j+1][i]){
                        isSorted = false;
                        buf = matrix[j][i];
                        matrix[j][i] = matrix[j+1][i];
                        matrix[j+1][i] = buf;
                    }

                }
            }
            isSorted = false;
        }
        System.out.println("Ascending sorted matrix: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //bubble sort ->
        for (int i = 0; i < n; i++){
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < m-1; j++){
                    if (matrix[j][i] < matrix[j+1][i]){
                        isSorted = false;
                        buf = matrix[j][i];
                        matrix[j][i] = matrix[j+1][i];
                        matrix[j+1][i] = buf;
                    }

                }
            }
            isSorted = false;
        }
        System.out.println("Descending sorted matrix: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
