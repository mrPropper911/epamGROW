package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
        int n;//matrix size
        int setValue = 0;

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
            setValue += 1;
            for (int j = 0; j < n-i; j++) {
                matrix[i][j] = setValue;
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
