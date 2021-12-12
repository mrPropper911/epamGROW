package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static HashMap<Integer, Integer> twins (int N){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = N; i < 2*N; i += 3 )
            map.put(i,i+2);
        return map;
    }

    public static void main(String[] args) throws IOException {
	/*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/
        int N;
        int N2;
        HashMap<Integer, Integer> map = new HashMap<>();

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        N = Integer.parseInt(buff.readLine());

        map = twins(N);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
