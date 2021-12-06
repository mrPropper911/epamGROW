package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
	причем в каждом столбце число единиц равно номеру столбца.*/

        int m;//number of column
        int n;//number of row
        int count = 0;
        boolean check = false;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of column: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter number of row: ");
        n = Integer.parseInt(buff.readLine());

        //create matrix with random elements
        int[][] matrix = new int[m][n];
        Random r = new Random();
        for (int i = 0; i < n; i++){
            count = 0;
            check = false;
            for (int j = 0; j < m; j++){
                if (!check){
                    matrix[j][i] = r.nextInt(2);
                    if (matrix[j][i] == 1)
                        count++;
                    if (count == i+1)
                        check = true;
                    if (j == m-1 && count != i+1)
                        i --;
                    continue;
                }
                matrix[j][i] = 0;
                if (j == m-1 && count != i+1)
                    i --;
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
