import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
        sideA = 3;
        sideB = 4;
        sideC = 5;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void checkPerimeter(){
        System.out.println("Perimeter: " + (sideA + sideB + sideC));
    }

    public void checkSquare(){
        double p = sideA + sideB +sideC;
        double square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Square: " + square);
    }

    public void chekMedianPoint(){
        //for convenience, the vertex will lie on the axis Y
        //(sideA,0)(0,sideB)((-1)*sideC,0)
        double d1 = (double) (sideA + (-1) * sideC)/3;
        double d2 = (double) (sideB) /3;
        System.out.println("Median point: x = " + d1 + " y = " + d2);
    }

    public static void main(String[] args) throws IOException {
        /*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/
        Triangle triangle = new Triangle();
        int choise = 5;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("\nChoose operation: \n" +
                    "1 - Set triangle: \n" +
                    "2 - Perimeter of triangle: \n" +
                    "3 - Square of triangle: \n" +
                    "4 - Median intersection point: \n" +
                    "5 - Exit");
            choise = Integer.parseInt(bufferedReader.readLine());
            switch (choise) {
                case (1):
                    System.out.println("Set side of triangle: ");
                    int takeA = Integer.parseInt(bufferedReader.readLine());
                    int takeB = Integer.parseInt(bufferedReader.readLine());
                    int takeC = Integer.parseInt(bufferedReader.readLine());
                    if (takeA + takeB > takeC && takeA + takeC > takeB && takeB + takeC > takeA){
                        triangle.setSideA(takeA);
                        triangle.setSideB(takeB);
                        triangle.setSideC(takeC);
                    }
                    else{
                        System.out.println("There is no triangle with such sides: ");
                    }
                        break;
                case (2): triangle.checkPerimeter(); break;
                case (3): triangle.checkSquare(); break;
                case (4): triangle.chekMedianPoint(); break;
                case (5): return;
                default:
                    System.out.println("Incorrect number, please enter number (1-3)");
                    break;
            }
        }
    }
}
