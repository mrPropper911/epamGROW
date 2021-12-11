package com.company;

public class Main {

    public static long factorial(int num){
        if(num >= 1)
            return num * factorial(num -1);
        else
            return 1;
    }

    public static long sumFactorial(){
        long sum = 0;
        for (int i = 1; i <= 9; i++){
            if (i%2 != 0)
                sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
	/*7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/
        System.out.println("Sum of odd numbers: " + sumFactorial());
    }
}
