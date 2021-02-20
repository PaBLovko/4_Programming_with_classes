package by.epam.tasks.classes.fourth;

/*      Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
        назначения должны быть упорядочены по времени отправления.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Train {
    public Train(String destinationPoint, int trainNumber, String departureTime) {
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private final String destinationPoint;
    private final int trainNumber;
    private final String departureTime;

    @Override
    public String toString() {
        return "Train{" +
                "destinationPoint='" + destinationPoint + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Гомель", 12,"15:10");
        trains[1] = new Train("Минск",  15,"21:40");
        trains[2] = new Train("Гомель",22,"10:00");
        trains[3] = new Train("Брест",6,"13:10");
        trains[4] = new Train("Мозырь",7,"15:07");
        seeInformationOnTrains(trains);
        sortByTrainNumbers(trains);
        seeInformationOnTrains(trains);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println(Objects.requireNonNull(getTrainByNumber(trains, Integer.parseInt(string))).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        sortByDestinationPoint(trains);
        seeInformationOnTrains(trains);
    }

    private static Train getTrainByNumber(Train[] trains, int trainNumber) {
        sortByTrainNumbers(trains);
        for (Train train: trains)
            if(train.trainNumber == trainNumber) return train;
        return null;
    }

    private static void seeInformationOnTrains(Train[] trains) {
        for (Train train: trains)
            System.out.println(train.toString());
        System.out.println();
    }

    private static void sortByTrainNumbers(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>(){
            public int compare(Train trainFirst, Train trainSecond){
                return trainFirst.trainNumber - trainSecond.trainNumber;
            }
        });
    }

    private static void sortByDestinationPoint(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            public int compare(Train o1, Train o2) {
                if(!o1.destinationPoint.equals(o2.destinationPoint))
                    return o1.destinationPoint.compareTo(o2.destinationPoint);
                else return o1.departureTime.compareTo(o2.departureTime);
            }
        });
    }
}
