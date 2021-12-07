package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int[][] checkMatrix(int[][] matrix, int n){
        int sum = 0;
        int sumTest = 0;
        Random r = new Random();
        //up+
        for (int i = 0; i < n; i++){
                sum+=matrix[0][i];
        }
        //left+
        sumTest = matrix[0][0];
        for (int i = 1 ; i < n; i++){
            matrix[i][0] = r.nextInt(n*n-1)+1;
            sumTest+=matrix[i][0];
            if (sumTest != sum && i == n-1){
                i = 0;
                sumTest = matrix[0][0];
            }
        }
        //right+
        sumTest = matrix[0][n-1];
        for (int i = 1 ; i < n; i++) {
            matrix[i][n-1] = r.nextInt(n*n-1)+1;
            sumTest+=matrix[i][n-1];
            if (sumTest != sum && i == n-1){
                i = 0;
                sumTest = matrix[0][n-1];
            }
        }
        //down+
        sumTest = matrix[n-1][0] + matrix[n-1][n-1];
        for (int i = 1 ; i < (n-1); i++) {
            matrix[n-1][i] = r.nextInt(n*n-1)+1;
            sumTest+=matrix[n-1][i];
            if (sumTest != sum && i == n-2){
                i = 0;
                sumTest = matrix[n-1][0] + matrix[n-1][n-1];
            }
        }
        //main diagonal+
        sumTest = matrix[0][0] + matrix[n-1][n-1];
        for (int i = 1 ; i < (n-1); i++) {
            matrix[i][i] = r.nextInt(n*n-1)+1;
            sumTest+=matrix[i][i];
            if (sumTest != sum && i == n-2){
                i = 0;
                sumTest = matrix[0][0] + matrix[n-1][n-1];
            }
        }
        //second diagonal
        sumTest = matrix[0][n-1] + matrix[n-1][0] + matrix[n/2][n/2];
        for (int i = 1 ; i < (n-1); i++) {
            if (i == n/2)
                continue;
            matrix[i][n-i] = r.nextInt(n*n-1)+1;
            sumTest+=matrix[i][n-i];
            if (sumTest != sum && i == n-2){
                i = 0;
                sumTest = matrix[0][n-1] + matrix[n-1][0] + matrix[n/2][n/2];
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws IOException {
	/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3*/
        int n;//matrix size
        int sum;
        boolean check = false;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the matrix: ");
        n = Integer.parseInt(buff.readLine());

        int[][] matrix = new int[n][n];
        //fill in the matrix
        Random r = new Random();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = r.nextInt(n*n-1)+1;
            }
        }
        matrix = checkMatrix(matrix, n);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
