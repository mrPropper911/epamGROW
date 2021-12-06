package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*1. Дана матрица. Вывести на экран все нечетные столбцы,
	у которых первый элемент больше последнего.*/
        int m;//number of rows
        int n;//number of columns

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(buff.readLine());
        n = Integer.parseInt(buff.readLine());

        //create matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 1+(int)(Math.random()*100);
            }
        }

        //search and out result
        for (int i = 1; i < m-1; i+=2){
            if (matrix[i][0] > matrix [i][n-1]){
                for (int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
