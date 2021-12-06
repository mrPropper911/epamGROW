package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
	Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.*/
        int m = 10;//number of column
        int n = 20;//number of row
        int temp;

        //create matrix
        int[][] matrix = new int[m][n];
        Random r = new Random();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = r.nextInt(15);
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //search row with 5
        System.out.println("Line number: ");
        for (int i = 0; i < m; i++){
            temp = 0;
            for (int j = 0; j < n; j++){
               if (matrix[i][j] == 5)
                   temp++;
            }
            if (temp >= 3)
                System.out.print((i + 1) + " ");

        }

    }
}
