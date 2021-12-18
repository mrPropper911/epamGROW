public class Test2 {
    int firstNumber;
    int secondNumber;

    public Test2(){
        firstNumber = 3;
        secondNumber = 4;
    }

    public Test2(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public static void main(String[] args) {
        /*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        класса.*/

        Test2 myTest = new Test2();
        myTest.setFirstNumber(111);
        myTest.setSecondNumber(222);
        System.out.println(myTest.getFirstNumber());
        System.out.println(myTest.getSecondNumber());
    }
}
