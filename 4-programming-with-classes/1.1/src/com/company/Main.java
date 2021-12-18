package com.company;

public class Main {

    public static void main(String[] args) {
	/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.*/
    Test1 myTest = new Test1(6,9);
    myTest.printOut(myTest.firstNumber);
    myTest.printOut(myTest.secondNumber);
    myTest.printOut(myTest.sum(myTest.firstNumber, myTest.secondNumber));
    myTest.printOut(myTest.comparison(myTest.secondNumber, myTest.firstNumber));
    }
}

class Test1 {
    int firstNumber;
    int secondNumber;

    public Test1(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum (int first, int second){
       return first + second;
    }

    public int comparison(int first, int second){
        if (first > second)
            return first;
        else
            return second;
    }

    public void printOut (int number){
        System.out.println(number);
    }
}


