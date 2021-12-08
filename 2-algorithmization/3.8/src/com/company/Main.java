package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int nod(int x, int y){
        if (y == 0){
            return x;
        }
        return nod(y, x % y);
    }
    public static int nok(int x, int y){
        return x*y/nod(x, y);
    }

    public static void main(String[] args) throws IOException {
	/*Даны дроби. Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.*/
        int n;//size array
        int nd;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        n = Integer.parseInt(buff.readLine());

        Random r = new Random();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++){
            p[i] = r.nextInt(10-2) + 2;
            q[i] = r.nextInt(10-2) + 2;
        }

        System.out.println("First state: ");
        for (int i = 0; i < n; i++){
            System.out.print(p[i] + "/" + q[i] + " ");
        }

        System.out.println("\nCommon denominator: ");
        nd = q[0];
        for (int i = 0; i < n-1; i++){
            for (int j = 1; j < n; j++){
                int temp = nok(q[i], q[j]);
                if (nd < temp)
                    nd = temp;
            }
        }

        System.out.println(nd);

        boolean isSorted = false;
        double temp1;
        double temp2;
        int buf1;
        int buf2;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < n-1; i++) {
                temp1 = p[i]*1.0/q[i];
                temp2 = p[i+1]*1.0/q[i+1];
                if(temp1 > temp2){
                    isSorted = false;
                    buf1 = p[i];
                    buf2 = q[i];
                    p[i] = p[i+1];
                    q[i] = q[i+1];
                    p[i+1] = buf1;
                    q[i+1] = buf2;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++){
            System.out.print(p[i] + "/" + q[i] + " ");
        }
    }
}
