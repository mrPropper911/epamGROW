package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*7. Сформировать квадратную матрицу порядка N по правилу:*/
        int n;//matrix size

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter an even size of the matrix: ");
            n = Integer.parseInt(buff.readLine());
        } while (n % 2 != 0);

        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = Math.sin(((i*i-j*j)/2));
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
