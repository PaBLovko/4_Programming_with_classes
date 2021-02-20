package by.epam.tasks.aggregation.fifth.bean;

import java.util.Objects;

public abstract class Tour {
    public String type;
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int cost;
	    
    public Tour(int cost,String transport,boolean food,int numberOfDays) {
        this.cost = cost; 
        this.transport=transport;
        this.food=food;
        this.numberOfDays=numberOfDays;
    }
	
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
      
    public boolean getFood(){
        return food;
    }
    public void setFood(boolean food){
        this.food=food;
    }


    public String getTransport(){
        return transport;
    }
    public void setTransport(String transport) {
        this.transport=transport;
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }
      
    public int getNumberOfDays(){
        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays){
        this.numberOfDays=numberOfDays;
    }

    @Override
    public int hashCode() { return Objects.hash(numberOfDays, cost, food, transport, type); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return numberOfDays == tour.numberOfDays &&
                cost == tour.cost &&
                food == tour.food &&
                Objects.equals(transport, tour.transport) &&
                Objects.equals(type, tour.type);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "type=" + type +
                ", transport=" + transport +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                ", cost=" + cost +
                '}';
    }
}
