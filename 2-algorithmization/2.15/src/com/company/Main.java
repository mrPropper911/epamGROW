package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
        int m;//number of column
        int n;//number of row
        int maxElement;

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

        //search max element in matrix
        maxElement = matrix[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] > maxElement)
                    maxElement = matrix[i][j];
            }
        }

        //change matrix
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = maxElement;
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
