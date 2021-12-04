package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	    int a,b;
        List<Integer> listOfa = new ArrayList<>();
        List<Integer> listOfb = new ArrayList<>();
        HashSet<Integer> listHash = new HashSet<Integer>();

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(buff.readLine());
        b = Integer.parseInt(buff.readLine());

        while (a != 0){
            listOfa.add(a % 10);
            a/=10;
        }
        while (b != 0){
            listOfb.add(b % 10);
            b/=10;
        }
        for (Integer i : listOfa){
            for (Integer j : listOfb){
                if (i==j)
                    listHash.add(i);
            }
        }
        for (Integer i : listHash){
            System.out.println(i);
        }





    }
}
