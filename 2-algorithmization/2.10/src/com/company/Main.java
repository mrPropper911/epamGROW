package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*10. Найти положительные элементы главной диагонали квадратной матрицы.*/
        int n;//matrix size

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the matrix: ");
        n = Integer.parseInt(buff.readLine());

        int[][] matrix = new int[n][n];
        //fill in the matrix
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.sin(1 + (Math.random()*100))*100);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Positive elements of the main diagonal: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i==j && matrix[i][j] > 0)
                    System.out.print(matrix[i][j]);
            }
        }

    }
}
