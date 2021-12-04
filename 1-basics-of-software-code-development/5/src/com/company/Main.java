package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        int sec, min, hour;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        sec = Integer.parseInt(buffer.readLine());
        hour = sec/3600;
        min = (sec - hour * 3600)/60;
        sec = sec - hour * 3600 - min * 60;
        System.out.println(hour + "ч " + min + "мин " + sec + "с ");
    }
}
