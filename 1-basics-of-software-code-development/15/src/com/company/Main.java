package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        while (i < 201){
            sum*=Math.pow(i,2);
            i++;
        }
        System.out.println(sum);
    }
}
