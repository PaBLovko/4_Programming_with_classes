package by.epam.tasks.aggregation.second.bean;

import java.util.Objects;

public class Wheel {
    private int diameter;
    private boolean isWheel;

    public Wheel(int diameter) {
        this.diameter = diameter;
        this.isWheel = true;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean getIsWheel() {
        return isWheel;
    }

    public void setIsWheel(boolean wheel) {
        isWheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                isWheel == wheel.isWheel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, isWheel);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", isWheel=" + isWheel +
                '}';
    }
}
