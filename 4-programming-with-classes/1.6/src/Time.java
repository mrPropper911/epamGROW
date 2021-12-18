import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time() {
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public void getTime(){
        if (hours < 10)
            System.out.print("0" + hours + ":");
        else
            System.out.print(hours + ":");
        if (minutes < 10)
            System.out.print("0" + minutes + ":");
        else
            System.out.print(minutes + ":");
        if (seconds < 10)
            System.out.print("0" + seconds);
        else
            System.out.print(seconds);
    }

    public void setTime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter time HH:MM:SS: ");
            hours = Integer.parseInt(reader.readLine());
            if (hours >= 24 || hours < 0){
                System.out.println("Entered error value, set default value");
                hours = 0;
            }
            minutes = Integer.parseInt(reader.readLine());
            if (minutes > 60 || minutes < 0){
                System.out.println("Entered error value, set default value");
                minutes = 0;
            }
            seconds = Integer.parseInt(reader.readLine());
            if (seconds > 60 || seconds < 0){
                System.out.println("Entered error value, set default value");
                seconds = 0;
            }
            getTime();
            return;
        }
    }

    public void changeTime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter time for up HH:MM:SS: ");
            int changeHours = Integer.parseInt(reader.readLine());
            hours += changeHours;
            if (hours >= 24 || hours < 0){
                System.out.println("Entered error value, set default value");
                hours = 0;
            }
            int changeMinutes = Integer.parseInt(reader.readLine());
            minutes += changeMinutes;
            if (minutes > 60 || minutes < 0){
                System.out.println("Entered error value, set default value");
                minutes = 0;
            }
            int changeSeconds = Integer.parseInt(reader.readLine());
            seconds += changeSeconds;
            if (seconds > 60 || seconds < 0){
                System.out.println("Entered error value, set default value");
                seconds = 0;
            }
            getTime();
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        /*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Time myTime = new Time();
        int choise = 4;
        while (true){
            System.out.println("\nChoose operation: \n" +
                    "1 - Get time: \n" +
                    "2 - Set time: \n" +
                    "3 - Change time: \n" +
                    "4 - Exit");

            choise = Integer.parseInt(bufferedReader.readLine());
            switch (choise) {
                case (1): myTime.getTime(); break;
                case (2): myTime.setTime(); break;
                case (3): myTime.changeTime(); break;
                case (4): return;
                default:
                    System.out.println("Incorrect number, please enter number (1-4)");
                    break;
            }
         }
    }
}