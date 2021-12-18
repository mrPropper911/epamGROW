import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Train {
    String nameStation;
    int trainNumber;
    LocalTime trainTimeDeparture;

    public Train(){
        Random r = new Random();
        nameStation = String.valueOf(Station.values()[r.nextInt(Station.values().length)]);
        trainNumber = r.nextInt(1000-1) + 1;
        trainTimeDeparture = getTime();
    }

    public Train(String nameStation, int trainNumber, LocalTime trainTimeDeparture) {
        this.nameStation = nameStation;
        this.trainNumber = trainNumber;
        this.trainTimeDeparture = trainTimeDeparture;
    }

    public static LocalTime between(LocalTime startTime, LocalTime endTime) {
        int startSeconds = startTime.toSecondOfDay();
        int endSeconds = endTime.toSecondOfDay();
        int randomTime = ThreadLocalRandom
                .current()
                .nextInt(startSeconds, endSeconds);

        return LocalTime.ofSecondOfDay(randomTime);
    }

    public static LocalTime getTime(){
        return between(LocalTime.MIN, LocalTime.MAX);
    }

    public static void printTrain(Train outTrain){
        System.out.println("Train number: " + outTrain.trainNumber +
                "\nDestination: " + outTrain.nameStation +
                "\nTime departure: " + outTrain.trainTimeDeparture);
    }

    public static void sortByTrainNumber(ArrayList<Train> arrayOfTrain){
        boolean isSorted = false;
        int temp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arrayOfTrain.size()-1; i++){
                if (arrayOfTrain.get(i).trainNumber > arrayOfTrain.get(i+1).trainNumber){
                    isSorted = false;
                    Collections.swap(arrayOfTrain, i, i + 1);
                }
            }
        }
        for (Train index: arrayOfTrain){
            printTrain(index);
            System.out.println();
        }
    }

    public static void getInformationByTrain (ArrayList<Train> arrayOfTrain){
        boolean checkInErrore = false;
        int choiseUser;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trains that are contained in the database");
        for (Train index: arrayOfTrain){
            System.out.print(index.trainNumber + " ");
        }
        System.out.println("\nEnter number of train: ");
        choiseUser = scanner.nextInt();

        for (Train index: arrayOfTrain){
            if (index.trainNumber == choiseUser){
                checkInErrore = true;
                printTrain(index);
            }
        }

        if (!checkInErrore){
            System.out.println("The given train does not exist");
        }
    }

    public static void sortByDestination(ArrayList<Train> arrayOfTrain){
        Scanner scanner = new Scanner(System.in);
        String choiseUser;
        System.out.println("Destination that are contained in the database:");
        for (Train index: arrayOfTrain){
            System.out.print(index.nameStation + " ");
        }
        System.out.println("\nEnter name station of train: ");
        choiseUser = scanner.next();

        Boolean errorEnter = false;
        ArrayList<Train> choiseUserNameStationGroup = new ArrayList<>();
        for (Train index : arrayOfTrain){
            if (Objects.equals(choiseUser, index.nameStation)){
                errorEnter = true;
                choiseUserNameStationGroup.add(index);
            }
        }
        if (!errorEnter){
            System.out.println("Name not exist!!! ");
            return;
        }

        boolean isSorted = false;
        int temp;
        int check;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < choiseUserNameStationGroup.size()-1; i++){
                check = arrayOfTrain.get(i).trainTimeDeparture.compareTo(arrayOfTrain.get(i+1).trainTimeDeparture);
                if (check == -1){
                    isSorted = false;
                    Collections.swap(arrayOfTrain, i, i + 1);
                }
            }
        }

        for (Train index : choiseUserNameStationGroup){
            printTrain(index);
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        /*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/
        int choise = 4;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Train> groupOfTrain = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            groupOfTrain.add(new Train());
        }
        while (true){
            System.out.println("\nChoose operation: \n" +
                    "1 - Sort by number train: \n" +
                    "2 - Train information by number \n" +
                    "3 - Sort by destination \n" +
                    "4 - Exit");
            choise = Integer.parseInt(bufferedReader.readLine());
            switch (choise) {
                case (1): sortByTrainNumber(groupOfTrain); break;
                case (2): getInformationByTrain(groupOfTrain); break;
                case (3): sortByDestination(groupOfTrain); break;
                case (4): return;
                default:
                    System.out.println("Incorrect number, please enter number (1-3)");
                    break;
            }
        }
    }
}




























