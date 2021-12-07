import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public static void main(String[] args) throws IOException {
        /*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai  ai+1 , то продвигаются
на один элемент вперед. Если ai  ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.*/
        int m; //size first array
        int temp = 0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size array: ");
        m = Integer.parseInt(buff.readLine());

        int[] firstArray = new int[m];
        Random r = new Random();
        for (int i = 0; i < m; i++){
            firstArray[i] = r.nextInt(9-1)+1;
        }

        shellSort(firstArray);

        for (int i = 0; i < m; i++){
            System.out.print(firstArray[i] + " ");
        }

    }
}
