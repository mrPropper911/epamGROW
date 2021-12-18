import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class Student {
    String studentSurname;
    String studentName;
    int studentGroupNumber;
    int[] progress = new int[5];

    public Student() {
        Random r = new Random();
        studentSurname = randomizeString();
        studentName = randomizeString();
        studentGroupNumber = r.nextInt(100-1) + 1;
        for (int i = 0; i < 5; i++){
            progress[i] = r.nextInt(10-1) + 1;
        }
    }

    public void outExcellentStudents(Student student){
        for (int i = 0; i < student.progress.length; i++) {
            if (student.progress[i] < 9)
                return;
        }
        System.out.println("Excellent: "+ student.studentName + student.studentSurname);
    }

    public static String randomizeString(){
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    public static void main(String[] args) {
        /*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/
        ArrayList<Student> groupStudent = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++){
            Student student = new Student();
            groupStudent.add(student);
        }
        for (Student index : groupStudent){
            index.outExcellentStudents(index);
        }
    }
}


