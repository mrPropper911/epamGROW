import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counterino {
    public int min;
    public int max;
    public int current;

    public Counterino() {
        min = 0;
        max = 10;
        current = 1;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void down() {
        current = current - 1;
        if (current < min)
            current = max;
        getCurrent();
    }

    public void up() {
        current = current + 1;
        if (current > max)
            current = min;
        getCurrent();
    }

    public void getCurrent() {
        System.out.println("Min: " + this.min +
                "\nMax: " + this.max + "\nCurrent: " + this.current);
    }

    public static void main(String[] args) throws IOException {
        /*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/
        int choose = 4;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Counterino counterino = new Counterino();
        System.out.println("Initialize counter (if you enter  -1- you choose default value) : ");
        int number = Integer.parseInt(bufferedReader.readLine());
        if (number != 1) {
            System.out.println("Enter min value: ");
            int takeMin = Integer.parseInt(bufferedReader.readLine());
            counterino.setMin(takeMin);
            System.out.println("Enter max value: ");
            int takeMax = Integer.parseInt(bufferedReader.readLine());
            counterino.setMax(takeMax);
            System.out.println("Enter starting value: ");
            int takeCurrent = Integer.parseInt(bufferedReader.readLine());
            counterino.setCurrent(takeCurrent);
        }

        while (true) {
            System.out.println("\nChoose operation: \n" +
                    "1 - Current state: \n" +
                    "2 - Increase in condition: \n" +
                    "3 - Diminishing condition: \n" +
                    "4 - Exit");
            choose = Integer.parseInt(bufferedReader.readLine());
            switch (choose) {
                case (1): counterino.getCurrent(); break;
                case (2): counterino.up(); break;
                case (3): counterino.down(); break;
                case (4): return;
                default:
                    System.out.println("Incorrect symbol, please enter correct: ");
                    break;
            }

        }
    }
}