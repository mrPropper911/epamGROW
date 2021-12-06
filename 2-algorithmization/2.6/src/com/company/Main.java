package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
        int n;//matrix size

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter an even size of the matrix: ");
            n = Integer.parseInt(buff.readLine());
            if (n%2 == 0)
                break;
        }

        int[][] matrix = new int[n][n];
        //fill in the matrix according to the condition
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = i; j < n-i; j++){
                    matrix[i][j] = 1;
            }
        }
        int variable = 0;
        for (int i = n-1; i > n/2 - 1; i--){
            for (int j = variable; j < n-variable; j++){
                matrix[i][j] = 1;
            }
            variable++;
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
