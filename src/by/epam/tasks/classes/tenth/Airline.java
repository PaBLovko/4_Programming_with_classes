package by.epam.tasks.classes.tenth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
    private String destination;
    private int flightNumber;
    private String typeOfAircraft;
    private Date departureTime;
    private DayOfWeek weekday;

    public Airline(String destination, int flightNumber,
                   String typeOfAircraft, Date departureTime, DayOfWeek weekday) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = departureTime;
        this.weekday = weekday;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getWeekday() {
        return weekday;
    }

    public void setWeekday(DayOfWeek weekday) {
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfAircraft='" + typeOfAircraft + '\'' +
                ", departureTime=" + departureTime +
                ", weekday=" + weekday +
                '}';
    }
}
