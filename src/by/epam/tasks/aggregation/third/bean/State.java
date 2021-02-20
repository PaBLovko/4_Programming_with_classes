package by.epam.tasks.aggregation.third.bean;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private final String stateName;
    private final String capitalName;
    private final ArrayList<Region> regionArrayList;

    public State(String stateName, String capitalName, ArrayList<Region> regionArrayList) {
        this.stateName = stateName;
        this.capitalName = capitalName;
        this.regionArrayList = regionArrayList;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public ArrayList<Region> getRegionArrayList() {
        return regionArrayList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName, capitalName, regionArrayList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(stateName, state.stateName) &&
                Objects.equals(capitalName, state.capitalName) &&
                Objects.equals(regionArrayList, state.regionArrayList);
    }

    @Override
    public String toString() {
        return "State{" +
                "nameState='" + stateName +
                ", nameCapital='" + capitalName +
                ", regionList=" + regionArrayList +
                '}';
    }
}
