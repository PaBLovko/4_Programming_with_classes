package by.epam.tasks.aggregation.second.logic;

import by.epam.tasks.aggregation.second.bean.Wheel;

import java.util.ArrayList;

public class WheelLogic {
    public void changeWheel(Wheel wheel){
        wheel.setIsWheel(true);
    }

    public void breakWheel(ArrayList<Wheel> wheelArrayList){
        wheelArrayList.get((int)(Math.random()*(4))).setIsWheel(false);
    }

    public Wheel findBreakWheel(ArrayList<Wheel> wheelArrayList){
        for (Wheel wheel: wheelArrayList)
            if (wheel.getIsWheel()) return wheel;
        return null;
    }
}
