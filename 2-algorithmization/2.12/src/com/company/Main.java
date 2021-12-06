package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
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
        for (int i = 0; i < m; i++){
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < n-1; j++){
                    if (matrix[i][j] > matrix[i][j+1]){
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j + 1] = buf;
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

        //bubble sort <-
        for (int i = 0; i < m; i++){
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < n-1; j++){
                    if (matrix[i][j] < matrix[i][j+1]){
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j + 1] = buf;
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
