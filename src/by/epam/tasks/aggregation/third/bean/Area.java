package by.epam.tasks.aggregation.third.bean;

import java.util.Objects;

public class Area {
    private String areaName;
    private City areaCenterCity;
    private double areaSquare;

    public Area(String areaName, City areaCenterCity, double areaSquare) {
        this.areaName = areaName;
        this.areaCenterCity = areaCenterCity;
        this.areaSquare = areaSquare;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public City getAreaCenterCity() {
        return areaCenterCity;
    }

    public void setAreaCenterCity(City areaCenterCity) {
        this.areaCenterCity = areaCenterCity;
    }

    public double getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaName, areaCenterCity, areaSquare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.areaSquare, areaSquare) == 0 &&
                Objects.equals(areaName, area.areaName) &&
                Objects.equals(areaCenterCity, area.areaCenterCity);
    }

    @Override
    public String toString() {
        return "Area{" +
                "nameArea= " + areaName +
                ", areaCenterCity= " + areaCenterCity +
                ", areaSquare= " + areaSquare +
                '}';
    }
}
