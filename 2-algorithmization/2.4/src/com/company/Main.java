package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */
        int n;//matrix size

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter matrix size: ");
        n = Integer.parseInt(buff.readLine());

        //create matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            if (i%2 == 0){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = j+1;
                }
            }
            else {
                for (int j = 0; j < n; j++){
                    matrix[i][j] = n-j;
                }
            }
        }

        //out matrix
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
