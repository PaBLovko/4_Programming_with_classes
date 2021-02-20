package by.epam.tasks.aggregation.second.runner;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

import by.epam.tasks.aggregation.second.bean.Car;
import by.epam.tasks.aggregation.second.bean.Engine;
import by.epam.tasks.aggregation.second.bean.Wheel;
import by.epam.tasks.aggregation.second.logic.CarLogic;
import by.epam.tasks.aggregation.second.logic.WheelLogic;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Wheel> wheelArrayList = new ArrayList<>(Arrays.asList(
                new Wheel(20), new Wheel(20), new Wheel(20), new Wheel(20)));
        Car car = new Car("BMW M5", new Engine(375, 2000), wheelArrayList);
        CarLogic carLogic = new CarLogic();
        WheelLogic wheelLogic = new WheelLogic();
        String event = carLogic.run();
        switch (event) {
            case "all good":
                System.out.println(carLogic.getCarName(car));
                break;
            case "out of fuel":
                car.setFuel(false);
                System.out.println(event);
                carLogic.refuel(car);
                System.out.println("refuel");
                break;
            case "break Wheel":
                wheelLogic.breakWheel(car.getWheels());
                System.out.println(event);
                wheelLogic.changeWheel(wheelLogic.findBreakWheel(car.getWheels()));
                System.out.println("wheel replaced");
                break;
        }
    }
}