package by.epam.tasks.classes.tenth;

import java.util.ArrayList;
import java.util.Date;

public class AirlineList {
    private final ArrayList<Airline> airlineArrayList;

    public AirlineList(ArrayList<Airline> bookArrayList) {
        this.airlineArrayList = bookArrayList;
    }

    public ArrayList<Airline> getAirlineArrayList() {
        return airlineArrayList;
    }

    void add(String destination, int flightNumber, String planeType, Date departureTime, DayOfWeek dayOfWeek) {
        airlineArrayList.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    ArrayList<Airline> getAirlineByGivenDestination(String destination){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline airline : airlineArrayList)
            if (airline.getDestination().equals(destination)) list.add(airline);
        return list;
    }

    ArrayList<Airline> getAirlineByGivenDayOfWeek(DayOfWeek dayOfWeek){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline airline : airlineArrayList)
            if (airline.getWeekday().equals(dayOfWeek)) list.add(airline);
        return list;
    }

    ArrayList<Airline> getAirlineByGivenYearIntoAccountTheTime(Date date, DayOfWeek dayOfWeek){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline airline : airlineArrayList)
            if (airline.getWeekday().equals(dayOfWeek) &&
                    airline.getDepartureTime().compareTo(date)>0) list.add(airline);
        return list;
    }
}
