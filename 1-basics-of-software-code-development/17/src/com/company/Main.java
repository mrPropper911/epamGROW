package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i<Math.pow(2,31)){
            System.out.println((char)i + " - " + i);
            i++;
        }
    }
}
