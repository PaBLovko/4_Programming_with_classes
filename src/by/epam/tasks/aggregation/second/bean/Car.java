package by.epam.tasks.aggregation.second.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean isFuel;

    public Car(String modelName, Engine engine, ArrayList<Wheel> wheelArrayList) {
        this.modelName = modelName;
        this.engine = engine;
        this.wheels = wheelArrayList;
        this.isFuel = true;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public boolean isFuel() {
        return isFuel;
    }

    public void setFuel(boolean fuel) {
        isFuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isFuel == car.isFuel &&
                Objects.equals(modelName, car.modelName) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, engine, wheels, isFuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", isFuel=" + isFuel +
                '}';
    }
}
