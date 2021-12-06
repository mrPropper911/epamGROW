package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры. */
        int m;//number of rows
        int n;//number of columns
        int swap1;
        int swap2;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of row: ");
        m = Integer.parseInt(buff.readLine());
        System.out.println("Enter number of column: ");
        n = Integer.parseInt(buff.readLine());


        //create matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 1+(int)(Math.random()*100);
            }
        }
        System.out.println("Matrix before swap: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter first column for swap: ");
        swap1 = Integer.parseInt(buff.readLine());
        System.out.println("Enter second column for swap: ");
        swap2 = Integer.parseInt(buff.readLine());

        //swap columns
        int temp = 0;
        for (int i = 0; i < m; i++){
            temp = matrix[i][swap2-1];
            matrix[i][swap2-1] = matrix[i][swap1-1];
            matrix[i][swap1-1] = temp;
        }

        System.out.println("Matrix after swap: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
