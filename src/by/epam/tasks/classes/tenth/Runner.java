package by.epam.tasks.classes.tenth;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *    Найти и вывести:
 *    a) список рейсов для заданного пункта назначения;
 *    b) список рейсов для заданного дня недели;
 *    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.ParseException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws ParseException {
        AirlineList airlineList = new AirlineList(new ArrayList<>());
        airlineList.add("Минск", 123, "Боинг 201",
                Airline.simpleDateFormat.parse("12:35"), DayOfWeek.MONDAY);
        airlineList.add("Гомель", 321, "Боинг 201",
                Airline.simpleDateFormat.parse("11:35"), DayOfWeek.FRIDAY);
        airlineList.add("Брест", 242, "Боинг 201",
                Airline.simpleDateFormat.parse("19:35"), DayOfWeek.TUESDAY);
        airlineList.add("Гомель", 412, "Боинг 201",
                Airline.simpleDateFormat.parse("09:35"), DayOfWeek.SATURDAY);
        airlineList.add("Могилев", 523, "Боинг 201",
                Airline.simpleDateFormat.parse("08:35"), DayOfWeek.SATURDAY);

        for(Airline airline :airlineList.getAirlineByGivenDestination("Гомель"))
            System.out.println(airline.toString());
        System.out.println();
        for(Airline airline :airlineList.getAirlineByGivenDayOfWeek(DayOfWeek.SATURDAY))
            System.out.println(airline.toString());
        System.out.println();
        for(Airline airline :airlineList.getAirlineByGivenYearIntoAccountTheTime(
                Airline.simpleDateFormat.parse("10:00"),DayOfWeek.TUESDAY))
            System.out.println(airline.toString());
        System.out.println();
    }
}
