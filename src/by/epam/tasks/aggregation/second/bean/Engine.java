package by.epam.tasks.aggregation.second.bean;

import java.util.Objects;

public class Engine {
    private int power;
    private double volume;

    public Engine(int power, double volume) {
        this.power = power;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Double.compare(engine.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, volume);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                '}';
    }
}

