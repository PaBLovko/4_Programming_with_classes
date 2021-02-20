package by.epam.tasks.aggregation.second.logic;

import by.epam.tasks.aggregation.second.bean.Car;

public class CarLogic {

    public void refuel(Car car) {
        if (!car.isFuel()) car.setFuel(true);
    }

    public String run(){
        int event = (int)(Math.random()*3);
        String result;
        switch (event){
            case 0:
                result = "break Wheel";
                break;
            case 1:
                result = "out of fuel";
                break;
            default:
                result = "all good";
                break;
        }
        return result;
    }

    public String getCarName(Car car){
        return car.getModelName();
    }
}
