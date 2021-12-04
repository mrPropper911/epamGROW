package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 100){
            sum+=Math.pow(i,2);
            i++;
        }
        System.out.println(sum);
    }
}
